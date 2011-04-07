package grupo01;

import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Novato extends Role {

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
		worldAPI.setBehindBall(worldAPI.getOpponentsGoal());
		if (worldAPI.canKick())
			worldAPI.kick();
		if(worldAPI.blocked())
			worldAPI.avoidCollisions();
		return WorldAPI.ROBOT_OK;
	}

}
