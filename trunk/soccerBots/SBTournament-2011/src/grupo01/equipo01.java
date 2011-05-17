package grupo01;

import teams.rolebased.Role;
import teams.rolebased.RoleBasedTeam;
import teams.rolebased.TeamManager;

public class equipo01 extends RoleBasedTeam{

	public boolean ganando;
	protected Role[] getRoles() {
		Role[] roles;
		if(!ganando){
			Role[] roles1= {new Portero(),new Delantero(),new Lateral(),new Medio(),new Lateral()};
			roles = roles1;
		}
		else{
			Role[] roles2 = {new Portero(),new Delantero(),new Lateral(),new Lateral(),new Lateral()};
			roles = roles2;
		}
		return roles;
	}
	
	protected Role[] setRoles(Role[] nuevos){
		Role[] roles = nuevos;
		return roles;
	}

	@Override
	protected TeamManager getTeamManager() {
		return new equipo01Manager(this);
	}

}
