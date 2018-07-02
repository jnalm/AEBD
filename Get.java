package aebd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Get {
	
	public static ResultSet getCPU() {
            
            Connection c = null;
            ResultSet rs = null;
                    
            try {
                c = OracleConnection.getOracleConnection();
                PreparedStatement ps = c.prepareStatement("SELECT * FROM DBA_CPU_USAGE_STATISTICS");
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            /*
            finally {
                try {
                    c.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }*/
            //}
           return rs; 
        }
	
	public static ResultSet getUser() {
		
		Connection c = null;
        ResultSet rs = null;
                
        try {
            c = OracleConnection.getOracleConnection();
            PreparedStatement ps = c.prepareStatement("SELECT USERNAME, EXPIRY_DATE, CREATED, EXTERNAL_NAME, ACCOUNT_STATUS, PROFILE FROM DBA_USERS");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
        return rs;
        
	}
	
	public static ResultSet getPrivilege() {
		
		Connection c = null;
        ResultSet rs = null;
                
        try {
            c = OracleConnection.getOracleConnection();
            PreparedStatement ps = c.prepareStatement("SELECT PRIVILEGE, USERNAME, ADMIN_OPTION FROM DBA_SYS_PRIVS");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
        return rs;
        
	}
	
	public static ResultSet getTablespace() {
		
		Connection c = null;
        ResultSet rs = null;
                
        try {
            c = OracleConnection.getOracleConnection();
            PreparedStatement ps = c.prepareStatement("SELECT MAX_SIZE, BLOCK_SIZE, TABLESPACE_NAME, CONTENTS, NEXT_EXTENT, INITIAL_EXTENT FROM DBA_TABLESPACES");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
        return rs;
        
	}
	
}
