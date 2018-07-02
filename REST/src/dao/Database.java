package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl12c";
    public static final String DB_USER = "sys as sysdba";
    public static final String DB_PASSWORD = "oracle";
    
    public Connection getOracleConnection() {
    	
    	Connection oc = null;
    	
    	try {
    		
    		Class.forName(DB_DRIVER);
    		
    	} catch (ClassNotFoundException e) {
    		
    		System.out.println("Error driver JDBC: "+e.getMessage());
    		
    	}
    	
    	try {

    		oc = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
            return oc;

        } catch (SQLException e) {

            System.out.println("Cannot open connection: "+e.getMessage());

        }

        return oc;

        }
	
}
