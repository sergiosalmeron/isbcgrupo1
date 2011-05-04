package grupo01;

import teams.rolebased.Role;
import teams.rolebased.RoleBasedTeam;
import teams.rolebased.TeamManager;

public class equipo01 extends RoleBasedTeam{

	@Override
	protected Role[] getRoles() {
		Role[] roles= {new Portero(),new Delantero(),new Lateral(),new Medio(),new Lateral()};
		
		return roles;
	}

	@Override
	protected TeamManager getTeamManager() {
		return new equipo01Manager();
	}

}
