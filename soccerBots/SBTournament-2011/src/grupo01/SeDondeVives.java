package grupo01;

import teams.rolebased.Role;
import teams.rolebased.RoleBasedTeam;
import teams.rolebased.TeamManager;

public class SeDondeVives extends RoleBasedTeam{

	public boolean ganando;
	public boolean empate = true;
	public Role s = new Portero();
	public Role l = new Lateral();
	public Role l1 = new Lateral();
	public Role l2 = new Lateral();
	public Role d = new Delantero();
	public Role n = new Novato();
	public Role m = new Medio();
	private TeamManager manager = new equipo01Manager(this);
	
	
	protected Role[] getRoles() {
		Role[] roles = {s,d,l,n,l1};
	
		return roles;
	}
	

	@Override
	protected TeamManager getTeamManager() {
		return manager;
	}

}
