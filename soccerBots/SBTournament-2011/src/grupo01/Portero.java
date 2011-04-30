package grupo01;

import EDU.gatech.cc.is.util.Vec2;
import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Portero extends Role {

	@Override
	public int configure() {
		// TODO Auto-generated method stub
		worldAPI.setDisplayString("Portero");
		return WorldAPI.ROBOT_OK;
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}

	@Override
	public int takeStep() {
		// TODO Auto-generated method stub
	//	worldAPI.setBehindBall(worldAPI.getOpponentsGoal());
		Vec2 bola = worldAPI.getBall();
		Vec2 mover = new Vec2 (worldAPI.getOurGoal().x,bola.y);
		mover.sett(worldAPI.getOurGoal().t);
		mover.setr(1.0);
		System.out.println(worldAPI.getOurGoal().x);
		System.out.println(worldAPI.getPosition().x);
		if (Math.abs(worldAPI.getOurGoal().x)<=Math.abs(-0.07)){
			if (bola.y>worldAPI.getPosition().y && worldAPI.getSteerHeading()==mover.PI/2 && worldAPI.getPosition().y<0.20){
				worldAPI.setSteerHeading(mover.PI/2);
				worldAPI.setSpeed(1.0);
			}
			else if (bola.y>worldAPI.getPosition().y && worldAPI.getSteerHeading()!=mover.PI/2){
				worldAPI.setSteerHeading(mover.PI/2);
				worldAPI.setSpeed(0.0);
			}
			else if (bola.y<worldAPI.getPosition().y && worldAPI.getSteerHeading()==3*mover.PI/2 && worldAPI.getPosition().y>-0.20){
				worldAPI.setSteerHeading(3*(mover.PI/2));
				worldAPI.setSpeed(1.0);
			}  
			else if (bola.y<worldAPI.getPosition().y && worldAPI.getSteerHeading()!=3*mover.PI/2){
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

		//worldAPI.setBehindBall(mover);
		

	/*	if (worldAPI.canKick())
			worldAPI.kick();
		if(worldAPI.blocked())
			worldAPI.avoidCollisions();*/
		return WorldAPI.ROBOT_OK;
	}

}

