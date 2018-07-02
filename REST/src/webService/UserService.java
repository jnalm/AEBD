package webService;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import dto.User;
import model.AccessManager;

@Path("/userService")
public class UserService {

	@GET
	@Path("/users")
	@Produces("application/json")
	
	public String user() {
		
		String users = null;
		ArrayList<User> userList = new ArrayList<User>();
		try {
			userList = new AccessManager().getUser();
			Gson gson = new Gson();
			users = gson.toJson(userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
}
