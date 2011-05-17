package grupo01;

import teams.rolebased.Role;
import teams.rolebased.RoleBasedTeam;
import teams.rolebased.TeamManager;

public class equipo01 extends RoleBasedTeam{

	public boolean ganando;
	public boolean empate;
	protected Role[] getRoles() {
		Role[] roles;
		if(!ganando){
			if (empate){
			Role[] roles1= {new Portero(),new Delantero(),new Lateral(),new Novato(),new Lateral()};
			roles = roles1;
			}
			else {
				Role[] roles1= {new Portero(),new Delantero(),new Medio(),new Novato(),new Lateral()};
				roles = roles1;
			}
		}
		else{
			Role[] roles2 = {new Portero(),new Novato(),new Lateral(),new Lateral(),new Lateral()};
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
