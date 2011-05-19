package grupo01;

import EDU.gatech.cc.is.util.Vec2;
import teams.rolebased.Role;
import teams.rolebased.WorldAPI;

public class Novato extends Role {

	@Override
	public int configure() {
		// TODO Auto-generated method stub
		worldAPI.setDisplayString("Bloqueador");
		return WorldAPI.ROBOT_OK;
	}

	@Override
	public void gameOver() {
		// TODO Auto-generated method stub

	}

	@Override
	public int takeStep() {
		// TODO Auto-generated method stub
		worldAPI.blockGoalKeeper();

		if(worldAPI.blocked())
			worldAPI.avoidCollisions();
		return WorldAPI.ROBOT_OK;
	}

}
