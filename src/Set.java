import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Set implements Sets {
	
	private OracleConnection oc;
	
	public void createTablespace(String name, int size) throws SQLException {
		int size_temp = size / 2;
		String query = "create tablespace " + name + "\r\n" + 
				"datafile '\\u01\\app\\oracle\\oradata\\orcl12\\orcl\\" + name + ".dbf'\r\n" + 
				"size " + size + "M;\r\n" + 
				"\r\n" + 
				"create temporary tablespace aebd_project_temp\r\n" + 
				"tempfile '\\u01\\app\\oracle\\oradata\\orcl12\\orcl\\" + name + "temp.dbf'\r\n" + 
				"size " + size_temp + "M\r\n" + 
				"autoextend on;";
		
		PreparedStatement ps = oc.getOracleConnection().prepareStatement(query);
		
		ps.executeUpdate();
		
	}
	
	public void createUser(String username) throws SQLException {
		String q = "create user " + username + "\r\n" + 
				"identified by 1234\r\n" + 
				"default tablespace aebd_project\r\n" + 
				"temporary tablespace aebd_project_temp\r\n" + 
				"account unlock;\r\n" + 
				"\r\n" + 
				"grant connect to " + username + ";";
		PreparedStatement ps = oc.getOracleConnection().prepareStatement(q);
		
		ps.executeUpdate();
		
	}
	
}
