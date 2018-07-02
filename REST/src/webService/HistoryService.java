package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.History;
import model.AccessManager;

@Path("/historyService")
public class HistoryService {

	@GET
	@Path("/historys")
	@Produces("application/json")
	
	public String history() {
		
		String historys = null;
		ArrayList<History> historyList = new ArrayList<History>();
		try {
			historyList = new AccessManager().getHistory();
			Gson gson = new Gson();
			historys = gson.toJson(historyList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return historys;
	}
	
}
