package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Session;
import model.AccessManager;

@Path("/sessionService")
public class SessionService {

	@GET
	@Path("/sessions")
	@Produces("application/json")
	
	public String session() {
		
		String sessions = null;
		ArrayList<Session> sessionList = new ArrayList<Session>();
		try {
			sessionList = new AccessManager().getSession();
			Gson gson = new Gson();
			sessions = gson.toJson(sessionList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sessions;
	}
	
}
