package grupo01;

import teams.rolebased.Role;
import teams.rolebased.RoleBasedTeam;
import teams.rolebased.TeamManager;

public class equipo01 extends RoleBasedTeam{

	@Override
	protected Role[] getRoles() {
		Role[] roles= {new Portero(),new Medio(),new Lateral(),new Delantero(),new Lateral()};
		
		return roles;
	}

	@Override
	protected TeamManager getTeamManager() {
		// TODO Auto-generated method stub
		return new equipo01Manager();
	}

}
