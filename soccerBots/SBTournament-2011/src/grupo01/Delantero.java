package grupo01;

import EDU.gatech.cc.is.util.Vec2;
import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Delantero extends Role {
    //////////////////////////////////////////////////
    // Memory Variables                             //
    //////////////////////////////////////////////////
    private static int goalkeeper;
    private static int center;
    private static int tackler;
    private static int dribbler;
    private static int stopper;
    private static int defender;
    private static Vec2[][] gplayerlocations;
    private static int[][] gplayerpositions;
    private static Vec2 gplayerlastlocation;
    private static int gplayerlastposition;

    private static Vec2[] gballlocations;
    private static Vec2 gballlastlocation;

    private static int lado;

    //////////////////////////////////////////////////
    // Sensor Data                                  //
    //////////////////////////////////////////////////    

    private long ctime;
    private int mynumber;

    private Vec2 gball, eball;
    private Vec2 gplayer, eplayer;
    private Vec2 gourgoal, eourgoal; 
    private Vec2 goppgoal, eoppgoal;
    
    private Vec2[] gourteam, eourteam;
    private Vec2[] goppteam, eoppteam;

    private Vec2 eopponent, gopponent;
    private Vec2 eteammate, gteammate;

    //////////////////////////////////////////////////
    // Actuator Data                                //
    //////////////////////////////////////////////////    
    
    private boolean attemptkick;
    private Vec2 nextmove;
    private int nextposition;
    private Vec2 posicionInicial;
	private void updateSensors() {

        //////////////////////////////////////////////////
        // Sensor Data                                  //
        //////////////////////////////////////////////////    

        ctime = worldAPI.getTimeStamp();
        mynumber = worldAPI.getPlayerNumber();

        eplayer = new Vec2(0,0);
        gplayer = worldAPI.getPosition();

        eball = worldAPI.getBall();
        gball = new Vec2(0,0);
        gball.sett(eball.t);
        gball.setr(eball.r);
        gball.add(gplayer);

        eourgoal = worldAPI.getOurGoal();
        gourgoal = new Vec2(0,0);
        gourgoal.sett(eourgoal.t);
        gourgoal.setr(eourgoal.r);
        gourgoal.add(gplayer);

        eoppgoal = worldAPI.getOpponentsGoal();
        goppgoal = new Vec2(0,0);
        goppgoal.sett(eoppgoal.t);
        goppgoal.setr(eoppgoal.r);
        goppgoal.add(gplayer);
        
        eourteam = worldAPI.getTeammates();
        eoppteam = worldAPI.getOpponents();
        
        eteammate = worldAPI.getClosestMate();
        eopponent = worldAPI.getClosestOpponent();
    }
// más metodos auxiliares
//////////////////////////////////////////////////
    // Movement functions                           //
    //////////////////////////////////////////////////

    /**
       Has player move behind ball (or other point) with 
       respect to some target point.
     */
    private void moveBehind(Vec2 eball, Vec2 etarget) {
        Vec2 behindpoint = new Vec2(0, 0);
        double behind = 0;
        double pointside = 0;
        
        behindpoint.sett(etarget.t);
        behindpoint.setr(etarget.r);
        
        behindpoint.sub(eball);
        behindpoint.setr(- worldAPI.getPlayerRadius()* 1.8);
        
        behind = Math.cos(Math.abs(eball.t - behindpoint.t));
        
        pointside = Math.sin(Math.abs(eball.t - behindpoint.t));
        
        // if you are in FRONT
        if(behind > 0) {
            if( pointside > 0)
                behindpoint.sett(behindpoint.t + Math.PI / 2);
            else
                behindpoint.sett(behindpoint.t - Math.PI / 2);
        }
        
        nextmove.sett(eball.t);
        nextmove.setr(eball.r);
        nextmove.add(behindpoint);
        nextmove.setr(equipo01Manager.MAXSPEED);
    }

    /**
       If player is approximately behind the ball with
       respect to some target point, returns true.
     */
    private boolean behindBall(Vec2 eball, Vec2 etarget) {
        if (Math.abs(eball.t - etarget.t) < Math.PI / 10) 
            return true;
        else
            return false;
    }


    //////////////////////////////////////////////////
    // Proximity functions                          //
    //////////////////////////////////////////////////

    /**
       Returns true if player is closest to ball.
     */
    private boolean closestToBall(Vec2 gplayer) {
        return closestTo(gplayer, gball);
    }
    
    /**
       Returns true if player is closest to our goal.
    */
    private boolean closestToGoal(Vec2 gplayer) {
        return closestTo(gplayer, gourgoal);
    }
    
    /**
       Returns true if player is closest to opponents goal.
    */

    private boolean closestToOppGoal(Vec2 gplayer) {
        return closestTo(gplayer, goppgoal);
    }

    /** 
        Returns true if player is closest to center of field.
     */
    private boolean closestToCenter(Vec2 gplayer) {
        return closestTo(gplayer, new Vec2(equipo01Manager.ZERO, equipo01Manager.ZERO));
    }


    /**
       Returns true if player is closest to target point among
       teammates.
    */
    private boolean closestTo(Vec2 gplayer, Vec2 gtarget) {
        Vec2 temp = new Vec2(gplayer.x, gplayer.y);
        temp.sub(gtarget);
        
        double MyDist = temp.r;
        for (int i = 0; i < eourteam.length; i++)
            {
                temp = new Vec2(eourteam[i].x, eourteam[i].y);
                temp.add(gplayer);
                temp.sub(gtarget);
                double TheirDist = temp.r;
                if (TheirDist < MyDist)
                    return false;
            }
        for (int i = 0; i < this.eoppteam.length; i++)
        {
            temp = new Vec2(eoppteam[i].x, eoppteam[i].y);
            temp.add(gplayer);
            temp.sub(gtarget);
            double TheirDist = temp.r;
            if (TheirDist < MyDist)
                return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////
    // Zone functions                               //
    //////////////////////////////////////////////////
    
    /**
       If point is in goalzone, returns true.
    */
    private boolean goalzone(Vec2 gpoint) {
        if (lado == equipo01Manager.WESTSIDE) {
            if ( (Math.abs(equipo01Manager.XMIN - gpoint.x) < equipo01Manager.EPSILON) && (Math.abs(gpoint.y) < equipo01Manager.GOALMAX) ) {
                return true;
            }
        } else {
            if ( (Math.abs(equipo01Manager.XMAX - gpoint.x) < equipo01Manager.EPSILON) && (Math.abs(gpoint.y) < equipo01Manager.GOALMAX) ) {
                return true;
            }
        }
        return false;
    }

    /** 
        If point is in defzone, returns true.
    */
    private boolean defzone(Vec2 gpoint) {
        if (lado == equipo01Manager.WESTSIDE) {
            if (gpoint.x<=0) {
                return true;
            }
        } else {
        	if (gpoint.x>=0) {
                return true;
            }
        }       
        return false;
    }

	public int configure() {
		lado = worldAPI.getFieldSide();
		posicionInicial = worldAPI.getPosition();
		//Ahora para que cuando estemos atacando vuelvan a su posición
		if (lado == 1)
			posicionInicial.setx(0.0);
		else
			posicionInicial.setx(0.0);
		System.out.println(lado);
		worldAPI.setDisplayString("Delantero");
        goalkeeper = 0;
        center = 0;
        tackler = 0;
        dribbler = 0;
        stopper = 0;
        defender = 0;

        gballlocations = new Vec2[equipo01Manager.MEMORY];
        for (int i = 0; i < equipo01Manager.MEMORY; i++) {
            gballlocations[i] = new Vec2(0, 0);
        }
        
        gplayerlocations = new Vec2[equipo01Manager.PLAYERS][equipo01Manager.MEMORY];
        gplayerpositions = new int[equipo01Manager.PLAYERS][equipo01Manager.MEMORY];
        for (int i = 0; i < equipo01Manager.PLAYERS; i++) {
            for (int j = 0; j < equipo01Manager.MEMORY; j++) {
                gplayerlocations[i][j] = new Vec2(0, 0);
                gplayerpositions[i][j] = equipo01Manager.UNDEFINED;
            }
        }
        
       lado = worldAPI.getFieldSide();

        nextmove = new Vec2(0, 0);
		return WorldAPI.ROBOT_OK;
		// TODO Auto-generated method stub
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}
    private void updateActuators() {
    	worldAPI.setSteerHeading(nextmove.t);
    	worldAPI.setSpeed(nextmove.r);

    }
	@Override
	public int takeStep() {
		// TODO Auto-generated method stub
		updateSensors();
		System.out.println(lado);
		Vec2 bola = worldAPI.getBall();
		Vec2 mover = new Vec2 (worldAPI.getOurGoal().x,bola.y);

		//Cuando el balón está en zona de defensa
		if (this.defzone(gball)){
			//Si no está cerca de su posición y no controlamos la bola
			if (!worldAPI.closestToBall()){
				if (worldAPI.blocked()){
					worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI/2);
					worldAPI.setSpeed(1.0);
					worldAPI.setDisplayString("desbloqueo");
					return WorldAPI.ROBOT_OK;
				}
				if((this.posicionInicial.x!=worldAPI.getPosition().x)||((this.posicionInicial.y!=worldAPI.getPosition().y))){
					worldAPI.setDisplayString("Preparando el ataque");
					worldAPI.surroundPoint(worldAPI.getPosition(), posicionInicial);
					mover = worldAPI.getPosition();
					mover.sub(posicionInicial);
					worldAPI.setSteerHeading((Math.abs(Math.PI+mover.t)));
					worldAPI.setSpeed(1.0);
				}
				else {
					worldAPI.setDisplayString("Esperando la contra");
					worldAPI.surroundPoint(worldAPI.getPosition(), posicionInicial);
					mover = worldAPI.getPosition();
					mover.sub(posicionInicial);
					worldAPI.setSteerHeading((Math.abs(Math.PI+mover.t)));
					worldAPI.setSpeed(0.0);
				}
			}
			else{ // si tenemos la bola en defensa
				worldAPI.setDisplayString("sacando la bola");
				if ((!worldAPI.opponentBlocking() || !worldAPI.isBlocking(worldAPI.getClosestOpponent()))){
					worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI/2);
					worldAPI.setSpeed(1.0);
					worldAPI.setDisplayString("desbloqueo");
					return WorldAPI.ROBOT_OK;
				}
		        if (behindBall(eball, eoppgoal) && eball.t < worldAPI.getPlayerRadius() * 4) {
		            nextmove.sett(eoppgoal.t);
		            nextmove.setr(1.0);
		            worldAPI.avoidCollisions();
		            
		            if ((Math.abs(worldAPI.getSteerHeading() - eoppgoal.t) < Math.PI / 8) && 
		                (eoppgoal.r < worldAPI.getPlayerRadius() * 15)) {
		                worldAPI.kick();
		            }
		            this.updateActuators();
		        } else {
		            moveBehind(eball, eoppgoal);
		            worldAPI.avoidCollisions();
		            this.updateActuators();
		        }
			}
		}
		else { //Estamos atacando
			worldAPI.setDisplayString("Atacar");
			if ((!worldAPI.opponentBlocking() || !worldAPI.isBlocking(worldAPI.getClosestOpponent()))){
				worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI/2);
				worldAPI.setSpeed(1.0);
				worldAPI.setDisplayString("desbloqueo");
				return WorldAPI.ROBOT_OK;
			}
			if (worldAPI.closestToBall()){
				worldAPI.setDisplayString("Jugada Personal");
				 if (behindBall(eball, eoppgoal) && eball.t < worldAPI.getPlayerRadius() * 4) {
			            nextmove.sett(eoppgoal.t);
			            nextmove.setr(1.0);
			            worldAPI.avoidCollisions();
			            
			            if ((Math.abs(worldAPI.getSteerHeading() - eoppgoal.t) < Math.PI / 8) && 
			                (eoppgoal.r < worldAPI.getPlayerRadius() * 35)) {
			                worldAPI.kick();
			            }
			            this.updateActuators();
			        } else {
			            moveBehind(eball, eoppgoal);
			            worldAPI.avoidCollisions();
			            this.updateActuators();
			        }
			
			}
			else {
				if ((!worldAPI.opponentBlocking()) && worldAPI.blocked()){
					worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI/2);
					worldAPI.setSpeed(1.0);
					worldAPI.setDisplayString("desbloqueo");
					return WorldAPI.ROBOT_OK;
				}
				if (worldAPI.opponentsHaveGoalkeeper()){
					worldAPI.setDisplayString("Estorba al portero");
					worldAPI.blockGoalKeeper();
				}
			}
		}
		
		return WorldAPI.ROBOT_OK;
	}
	

}
