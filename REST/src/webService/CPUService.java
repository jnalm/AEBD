package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import dto.CPU;
import model.AccessManager;

@Path("/cpuService")
public class CPUService {

	@GET
	@Path("/cpus")
	@Produces("application/json")
	
	public String cpu() {
		
		String cpus = null;
		ArrayList<CPU> cpuList = new ArrayList<CPU>();
		try {
			cpuList = new AccessManager().getCPU();
			Gson gson = new Gson();
			cpus = gson.toJson(cpuList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cpus;
	}
	
}
