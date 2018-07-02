package com;
import webService.CPUService;
import webService.DatafileService;
import webService.HistoryService;
import webService.MemoryService;
import webService.PriviligeService;
import webService.RoleService;
import webService.SessionService;
import webService.TablespaceService;
import webService.UserService;

public class Main {

	public static void main(String[] args) throws Exception {
		
		CPUService c = new CPUService();
		c.cpu();
		DatafileService d = new DatafileService();
		d.datafile();
		HistoryService h = new HistoryService();
		h.history();
		MemoryService m = new MemoryService();
		m.memory();
		PriviligeService p = new PriviligeService();
		p.privilege();
		RoleService r = new RoleService();
		r.role();
		SessionService s = new SessionService();
		s.session();
		TablespaceService t = new TablespaceService();
		t.tablespace();
		UserService u = new UserService();
		u.user();
		
	}
	
	
	/*
	public static String readUrl(String urlString) throws Exception {
		
		BufferedReader reader = null;
		
		try {
			
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);
			return buffer.toString();
		} finally {
			if(reader != null)
				reader.close();
		}
		
	}
	*/
}
