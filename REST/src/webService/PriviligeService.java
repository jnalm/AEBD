package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Privilege;
import model.AccessManager;

@Path("/privilegeService")
public class PriviligeService {

	@GET
	@Path("/privileges")
	@Produces("application/json")
	
	public String privilege() {
		
		String privileges = null;
		ArrayList<Privilege> privilegeList = new ArrayList<Privilege>();
		try {
			privilegeList = new AccessManager().getPrivilege();
			Gson gson = new Gson();
			privileges = gson.toJson(privilegeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return privileges;
	}
	
}
