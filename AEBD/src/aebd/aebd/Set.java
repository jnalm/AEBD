package aebd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Set implements Sets {
	
	private OracleConnection oc;
	
	public void createTablespace(String name, int size) throws SQLException {
		int size_temp = size / 2;
                
                Connection c = OracleConnection.getOracleConnection();
		/*PreparedStatement ps = c.prepareStatement("create tablespace " + name + 
				" datafile '\\u01\\app\\oracle\\oradata\\orcl12\\orcl\\" + name + ".dbf'" + 
				" size " + size + "M;");*/
                PreparedStatement ps = c.prepareStatement("create tablespace paulinho datafile '\\u01\\app\\oracle\\oradata\\orcl12\\orcl\\paulinho.dbf' size 100M");
		/*ps.setString(3, size+""); 
                ps.setString(2, name);
                ps.setString(1, name);*/
                ps.executeUpdate();
                
                ps = c.prepareStatement("create temporary tablespace ?_temp\r\n" + 
				"tempfile '\\u01\\app\\oracle\\oradata\\orcl12\\orcl\\?_temp.dbf'\r\n" + 
				"size ?M\r\n" + 
				"autoextend on;\r\n");
                
                ps.setString(1, name);
                ps.setString(2, name);
                ps.setInt(3, size_temp);
                
		ps.executeUpdate();
		
	}
	
	public void createUser(String name, String tablespace, String pass) throws SQLException {
		String q = "create user ? \r\n" + 
				"identified by ?\r\n" + 
				"default tablespace ?\r\n" + 
				"temporary tablespace ?_temp\r\n" + 
				"account unlock;\r\n" + 
				"\r\n" + 
				"grant connect to ?;";
		PreparedStatement ps = OracleConnection.getOracleConnection().prepareStatement(q);
		
                ps.setString(1, name);
                ps.setString(2, pass);
                ps.setString(3, tablespace);
                ps.setString(4, tablespace);
                ps.setString(5, name);
                
		ps.executeUpdate();
		
	}
        
        public static void setCPU(ResultSet rs) {
            Connection c = null;
            String s = "insert into cpu (dbid, version, timestamp, cpu_count, cpu_core_count, cpu_socket_count) values (?,?,?,?,?,?)";
            try {
                c = StatusConnection.getStatusConnection();
                PreparedStatement ps = c.prepareStatement(s);
                
                while(rs.next())
                {
                    String um = rs.getString(1);
                    ps.setString(1, um);
                    System.out.println(um);
                    String dois = rs.getString(2);
                    ps.setString(2, dois);
                    System.out.println(dois);
                    String tres = rs.getString(3);
                    ps.setString(3, tres);
                    System.out.println(tres);
                    String quatro = rs.getString(4);
                    ps.setString(4, quatro);
                    System.out.println(quatro);
                    String cinco = rs.getString(5);
                    ps.setString(5, cinco);
                    System.out.println(cinco);
                    String seis = rs.getString(6);
                    ps.setString(6, seis);
                    System.out.println(seis);
                    
                    ps.executeUpdate();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally
            {
                try {
                    c.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        public static void setUser(ResultSet rs) {
            Connection c = null;
            String s = "insert into dbuser (name, expirationdate, creationdate, accountstatus, profile) values (?,?,?,?,?)";
            try {
                c = StatusConnection.getStatusConnection();
                PreparedStatement ps = c.prepareStatement(s);
                
                while(rs.next())
                {
                    String um = rs.getString(1);
                    ps.setString(1, um);
                    System.out.println(um);
                    String dois = rs.getString(2);
                    ps.setString(2, dois);
                    System.out.println(dois);
                    String tres = rs.getString(3);
                    ps.setString(3, tres);
                    System.out.println(tres);
                    String quatro = rs.getString(4);
                    ps.setString(4, quatro);
                    System.out.println(quatro);
                    String cinco = rs.getString(5);
                    ps.setString(5, cinco);
                    System.out.println(cinco);
                    
                    ps.executeUpdate();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally
            {
                try {
                    c.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        public static void setPrivilege(ResultSet rs) {
            Connection c = null;
            String s = "insert into privilege (privilege, name, property) values (?,?,?)";
            try {
                c = StatusConnection.getStatusConnection();
                PreparedStatement ps = c.prepareStatement(s);
                
                while(rs.next())
                {
                    String um = rs.getString(1);
                    ps.setString(1, um);
                    System.out.println(um);
                    String dois = rs.getString(2);
                    ps.setString(2, dois);
                    System.out.println(dois);
                    String tres = rs.getString(3);
                    ps.setString(3, tres);
                    System.out.println(tres);
                    
                    ps.executeUpdate();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally
            {
                try {
                    c.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        public static void setTablespace(ResultSet rs) {
            Connection c = null;
            String s = "insert into tablespace (maximumsize, size, name, type, autoextend, freespace) values (?,?,?,?,?,?)";
            try {
                c = StatusConnection.getStatusConnection();
                PreparedStatement ps = c.prepareStatement(s);
                
                while(rs.next())
                {
                    String um = rs.getString(1);
                    ps.setString(1, um);
                    System.out.println(um);
                    String dois = rs.getString(2);
                    ps.setString(2, dois);
                    System.out.println(dois);
                    String tres = rs.getString(3);
                    ps.setString(3, tres);
                    System.out.println(tres);
                    String quatro = rs.getString(4);
                    ps.setString(4, quatro);
                    System.out.println(quatro);
                    String cinco = rs.getString(5);
                    ps.setString(5, cinco);
                    System.out.println(cinco);
                    String seis = rs.getString(6);
                    ps.setString(6, seis);
                    System.out.println(seis);
                    
                    ps.executeUpdate();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally
            {
                try {
                    c.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
}
