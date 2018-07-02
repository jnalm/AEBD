package model;

import java.sql.Connection;
import java.util.ArrayList;

import dao.Access;
import dao.Database;
import dto.CPU;
import dto.Datafile;
import dto.History;
import dto.Memory;
import dto.Privilege;
import dto.Role;
import dto.Session;
import dto.Tablespace;
import dto.User;

public class AccessManager {

	public ArrayList<User> getUser() throws Exception {
		
		ArrayList<User> userList = new ArrayList<User>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		userList = access.getUser(con);
		return userList;
	}
	
	public ArrayList<CPU> getCPU() throws Exception {
		
		ArrayList<CPU> cpuList = new ArrayList<CPU>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		cpuList = access.getCPU(con);
		return cpuList;
	}
	
	public ArrayList<Datafile> getDatafile() throws Exception {
		
		ArrayList<Datafile> datafileList = new ArrayList<Datafile>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		datafileList = access.getDatafile(con);
		return datafileList;
	}
	
	public ArrayList<History> getHistory() throws Exception {
		
		ArrayList<History> historyList = new ArrayList<History>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		historyList = access.getHistory(con);
		return historyList;
	}
	
	public ArrayList<Memory> getMemory() throws Exception {
		
		ArrayList<Memory> memoryList = new ArrayList<Memory>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		memoryList = access.getMemory(con);
		return memoryList;
	}
	
	public ArrayList<Privilege> getPrivilege() throws Exception {
		
		ArrayList<Privilege> privilegeList = new ArrayList<Privilege>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		privilegeList = access.getPrivilege(con);
		return privilegeList;
	}
	
	public ArrayList<Role> getRole() throws Exception {
		
		ArrayList<Role> roleList = new ArrayList<Role>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		roleList = access.getRole(con);
		return roleList;
	}
	
	public ArrayList<Session> getSession() throws Exception {
		
		ArrayList<Session> sessionList = new ArrayList<Session>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		sessionList = access.getSession(con);
		return sessionList;
	}
	
	public ArrayList<Tablespace> getTablespace() throws Exception {
		
		ArrayList<Tablespace> tablespaceList = new ArrayList<Tablespace>();
		Database db = new Database();
		Connection con = db.getOracleConnection();
		Access access = new Access();
		tablespaceList = access.getTablespace(con);
		return tablespaceList;
	}
	
}
