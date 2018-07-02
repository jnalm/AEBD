package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Tablespace;
import model.AccessManager;

@Path("/tablespaceService")
public class TablespaceService {

	@GET
	@Path("/tablespaces")
	@Produces("application/json")
	
	public String tablespace() {
		
		String tablespaces = null;
		ArrayList<Tablespace> tablespaceList = new ArrayList<Tablespace>();
		try {
			tablespaceList = new AccessManager().getTablespace();
			Gson gson = new Gson();
			tablespaces = gson.toJson(tablespaceList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tablespaces;
	}
	
}
