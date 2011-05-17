package grupo01;

import EDU.gatech.cc.is.util.Vec2;
import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Portero extends Role {

	private boolean ganando;
	public int configure() {
		// TODO Auto-generated method stub
		worldAPI.setDisplayString("Portero");
		ganando = true;
		return WorldAPI.ROBOT_OK;
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}
	
	public boolean ganando(){
	 return ganando;
	}

	@Override
	public int takeStep() {
		// TODO Auto-generated method stub
	//	worldAPI.setBehindBall(worldAPI.getOpponentsGoal());
		ganando = (worldAPI.getMyScore()>worldAPI.getOpponentScore());
		Vec2 bola = worldAPI.getBall();
		Vec2 mover = new Vec2 (worldAPI.getOurGoal().x,bola.y);
		mover.sett(worldAPI.getOurGoal().t);
		mover.setr(1.0);
		System.out.println(worldAPI.getOurGoal().x);
		System.out.println(worldAPI.getPosition().x);
	//	worldAPI.setDisplayString("Portero");
		//Antes de los otros movimientos vamos a intentar desbloquearlo si esta bloqueado
		if (worldAPI.blocked()){
			worldAPI.avoidCollisions();
		}
		if (Math.abs(worldAPI.getOurGoal().x)<=Math.abs(-0.07)){
			worldAPI.setDisplayString("Pong");
			if (bola.y>worldAPI.getPosition().y && worldAPI.getSteerHeading()==mover.PI/2 && worldAPI.getPosition().y<0.20){
				worldAPI.setSteerHeading(mover.PI/2);
				worldAPI.setSpeed(1.0);
			}
			else if (bola.y>worldAPI.getPosition().y && worldAPI.getSteerHeading()!=mover.PI/2  || worldAPI.getPosition().y <=-0.20){
				worldAPI.setSteerHeading(mover.PI/2);
				worldAPI.setSpeed(0.0);
			}
			else if (bola.y<worldAPI.getPosition().y && worldAPI.getSteerHeading()==3*mover.PI/2 && worldAPI.getPosition().y>-0.20){
				worldAPI.setSteerHeading(3*(mover.PI/2));
				worldAPI.setSpeed(1.0);
			}  
			else if (bola.y<worldAPI.getPosition().y && worldAPI.getSteerHeading()!=3*mover.PI/2  || worldAPI.getPosition().y >=0.20){
				worldAPI.setSteerHeading(3*mover.PI/2);
				worldAPI.setSpeed(0.0);
			}
			else {
					//worldAPI.setSteerHeading(bola.t);
				//	worldAPI.setSpeed(0.0);
				}
			}
		else { 	
			worldAPI.setSteerHeading(mover.t);
			worldAPI.setSpeed(1.0);
		}
		//worldAPI.surroundPoint(worldAPI.getPosition(), mover);
		//worldAPI.blockForward();
		if (worldAPI.canKick()){
			worldAPI.setDisplayString("Despejando");
			worldAPI.setSteerHeading(worldAPI.getOurGoal().t+Math.PI);
			if (worldAPI.canKick() && worldAPI.alignedToBallandGoal())
			worldAPI.kick();
		}
		//worldAPI.setBehindBall(mover);
		if (worldAPI.getPosition().y <-0.20 && worldAPI.getPosition().y >0.20 && !worldAPI.blocked()){
			worldAPI.setSpeed(0.0);
			worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI);
			worldAPI.setDisplayString("Limite");
		}

	/*	if (worldAPI.canKick())
			worldAPI.kick();*/
		if(worldAPI.blocked()){
			worldAPI.setSteerHeading(worldAPI.getSteerHeading()+bola.PI/2);
			worldAPI.setSpeed(1.0);
			worldAPI.setDisplayString("desbloqueo");
		}
		return WorldAPI.ROBOT_OK;
	}

}

