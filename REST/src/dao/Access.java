package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.CPU;
import dto.Datafile;
import dto.History;
import dto.Memory;
import dto.Privilege;
import dto.Role;
import dto.Session;
import dto.Tablespace;
import dto.User;

public class Access {

	public ArrayList<CPU> getCPU(Connection c) throws SQLException {
		
		ArrayList<CPU> cpuList = new ArrayList<CPU>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM cpu");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				CPU cpuObj = new CPU();
				cpuObj.setId(rs.getInt("id"));
				cpuObj.setDbid(rs.getString(""));
				cpuObj.setCpu_core_count(rs.getString(""));
				cpuObj.setCpu_count(rs.getString(""));
				cpuObj.setTimeStamp(rs.getString(""));
				cpuObj.setCpu_socket_count(rs.getString(""));
				cpuList.add(cpuObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cpuList;
	}
	
	public ArrayList<Datafile> getDatafile(Connection c) throws SQLException {
		
		ArrayList<Datafile> datafileList = new ArrayList<Datafile>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM datafile");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Datafile datafileObj = new Datafile();
				datafileObj.setId(rs.getInt("id"));
				datafileObj.setFreeSpace(rs.getString(""));
				datafileObj.setAutoExtend(rs.getString(""));
				datafileObj.setName(rs.getString(""));
				datafileObj.setType(rs.getString(""));
				datafileObj.setMaximumSize(rs.getString(""));
				datafileObj.setSize(rs.getString(""));
				datafileList.add(datafileObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return datafileList;
		
	}
	
	public ArrayList<History> getHistory(Connection c) throws SQLException {
		
		ArrayList<History> historyList = new ArrayList<History>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM history");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				History historyObj = new History();
				historyObj.setId(rs.getInt("id"));
				historyList.add(historyObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return historyList;
		
	}
	
	public ArrayList<Memory> getMemory(Connection c) throws SQLException {
		
		ArrayList<Memory> memoryList = new ArrayList<Memory>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM datafile");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Memory memoryObj = new Memory();
				memoryObj.setId(rs.getInt("id"));
				memoryObj.setStatistic(rs.getString(""));
				memoryObj.setSgaPool(rs.getString(""));
				memoryObj.setBytes(rs.getString(""));
				memoryList.add(memoryObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memoryList;
		
	}
	
	public ArrayList<Privilege> getPrivilege(Connection c) throws SQLException {
		
		ArrayList<Privilege> privilegeList = new ArrayList<Privilege>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM datafile");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Privilege privilegeObj = new Privilege();
				privilegeObj.setId(rs.getInt("id"));
				privilegeObj.setName(rs.getString(""));
				privilegeObj.setProperty(rs.getString(""));
				privilegeObj.setPrivilege(rs.getString(""));
				privilegeList.add(privilegeObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return privilegeList;
		
	}
	
	
	public ArrayList<Role> getRole(Connection c) throws SQLException {
		
		ArrayList<Role> roleList = new ArrayList<Role>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM datafile");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Role roleObj = new Role();
				roleObj.setId(rs.getInt("id"));
				roleObj.setImplicit(rs.getString(""));
				roleObj.setRole(rs.getString(""));
				roleObj.setInherited(rs.getString(""));
				roleObj.setPassword_required(rs.getString(""));
				roleObj.setCommon(rs.getString(""));
				roleObj.setOracle_maintained(rs.getString(""));
				roleObj.setAuthentication_type(rs.getString(""));
				roleList.add(roleObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return roleList;
		
	}
	
	public ArrayList<Session> getSession(Connection c) throws SQLException {
		
		ArrayList<Session> sessionList = new ArrayList<Session>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM datafile");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Session sessionObj = new Session();
				sessionObj.setId(rs.getInt("id"));
				sessionObj.setSecs_in_wait(rs.getString(""));
				sessionObj.setSid(rs.getString(""));
				sessionObj.setClient_info(rs.getString(""));
				sessionObj.setSerial(rs.getString(""));
				sessionObj.setInstid(rs.getString(""));
				sessionObj.setSql_child_number(rs.getString(""));
				sessionObj.setSql_id(rs.getString(""));
				sessionObj.setStatus(rs.getString(""));
				sessionObj.setOsuser(rs.getString(""));
				sessionObj.setMachine(rs.getString(""));
				sessionObj.setAction(rs.getString(""));
				sessionObj.setModule(rs.getString(""));
				sessionObj.setCommand(rs.getString(""));
				sessionObj.setResource_consumer_group(rs.getString(""));
				sessionList.add(sessionObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sessionList;
		
	}
	
	public ArrayList<Tablespace> getTablespace(Connection c) throws SQLException {
		
		ArrayList<Tablespace> tablespaceList = new ArrayList<Tablespace>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM tablespace");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				Tablespace tablespaceObj = new Tablespace();
				tablespaceObj.setId(rs.getInt("id"));
				tablespaceObj.setMaximumSize(rs.getString(""));
				tablespaceObj.setSize(rs.getString(""));
				tablespaceObj.setName(rs.getString(""));
				tablespaceObj.setType(rs.getString(""));
				tablespaceObj.setAutoextend(rs.getString(""));
				tablespaceObj.setFreeSpace(rs.getString(""));
				tablespaceList.add(tablespaceObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tablespaceList;
		
	}
	
	public ArrayList<User> getUser(Connection c) throws SQLException {
		
		ArrayList<User> userList = new ArrayList<User>();
		PreparedStatement stmt = c.prepareStatement("SELECT * FROM user");
		ResultSet rs = stmt.executeQuery();
		try {
			while(rs.next()) {
				User userObj = new User();
				userObj.setId(rs.getInt("id"));
				userObj.setName(rs.getString(""));
				userObj.setExpirationDate(rs.getString(""));
				userObj.setCreationDate(rs.getString(""));
				userObj.setCommon(rs.getString(""));
				userObj.setAccountStatus(rs.getString(""));
				userObj.setStatus(rs.getString(""));
				userList.add(userObj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
		
	}
}
