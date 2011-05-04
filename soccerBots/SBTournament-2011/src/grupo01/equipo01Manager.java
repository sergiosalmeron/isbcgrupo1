package grupo01;

import teams.rolebased.TeamManager;
import teams.rolebased.WorldAPI;

public class equipo01Manager extends TeamManager {
	 //////////////////////////////////////////////////
    // Constantes que podremos usar en el equipo     //
    //////////////////////////////////////////////////

    public static final int MEMORY = 10;
    public static final int PLAYERS = 5;
    public static final int TEAMMATES = 4;

    public static final int UNDEFINED = -1;
    public static final int GOALKEEPER = 0;
    public static final int CENTER = 1;
    public static final int TACKLER = 2;
    public static final int DRIBBLER = 3;
    public static final int STOPPER = 4;
    public static final int DEFENDER = 5;

    public static final double INFINITY = 99999;
    public static final double EPSILON = 0.01;
    public static final double ZERO = 0.0;

    public static final double GOALMAX = 0.25;
    public static final double DZYMAX = 0.5;
    public static final double DZYMIN = -0.5;
    public static final double DZXMAX = 1.145;
    public static final double DZXMIN = -1.145;
    public static final double XMAX = 1.3096740;
    public static final double YMAX = 0.6980531;
    public static final double XMIN = -1.3096740;
    public static final double YMIN = -0.6980531;

    public static final int WESTSIDE = 1;
    public static final int EASTSIDE = -1;


    public static final double MAXSPEED = 1.0;
    public static final double HALFSPEED = 0.50;
    public static final double STOP = 0.0;

	@Override
	public int configure() {
	
		return WorldAPI.ROBOT_OK;
	}

	@Override
	public int takeStep() {	
		
		return WorldAPI.ROBOT_OK;
	}

}
