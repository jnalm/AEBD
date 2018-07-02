package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.Memory;
import model.AccessManager;

@Path("/memoryService")
public class MemoryService {

	@GET
	@Path("/memorys")
	@Produces("application/json")
	
	public String memory() {
		
		String memorys = null;
		ArrayList<Memory> memoryList = new ArrayList<Memory>();
		try {
			memoryList = new AccessManager().getMemory();
			Gson gson = new Gson();
			memorys = gson.toJson(memoryList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memorys;
	}
	
}
