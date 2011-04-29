package grupo01;

import EDU.gatech.cc.is.util.Vec2;
import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Portero extends Role {

	@Override
	public int configure() {
		// TODO Auto-generated method stub
		worldAPI.setDisplayString("trasLaBola");
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
		worldAPI.surroundPoint(worldAPI.getPosition(), mover);
	/*	if (worldAPI.canKick())
			worldAPI.kick();
		if(worldAPI.blocked())
			worldAPI.avoidCollisions();*/
		return WorldAPI.ROBOT_OK;
	}

}

