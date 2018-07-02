package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Datafile;
import model.AccessManager;

@Path("/datafileService")
public class DatafileService {

	@GET
	@Path("/datafiles")
	@Produces("application/json")
	
	public String datafile() {
		
		String datafiles = null;
		ArrayList<Datafile> datafileList = new ArrayList<Datafile>();
		try {
			datafileList = new AccessManager().getDatafile();
			Gson gson = new Gson();
			datafiles = gson.toJson(datafileList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return datafiles;
	}
	
}
