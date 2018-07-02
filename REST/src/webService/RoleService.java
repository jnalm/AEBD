package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Role;
import model.AccessManager;

@Path("/roleService")
public class RoleService {

	@GET
	@Path("/roles")
	@Produces("application/json")
	
	public String role() {
		
		String roles = null;
		ArrayList<Role> roleList = new ArrayList<Role>();
		try {
			roleList = new AccessManager().getRole();
			Gson gson = new Gson();
			roles = gson.toJson(roleList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roles;
	}
	
}
