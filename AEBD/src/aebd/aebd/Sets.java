package aebd;
import java.sql.SQLException;

public interface Sets {
	public void createTablespace(String name, int size) throws SQLException;
	public void createUser(String name, String tablespace, String pass) throws SQLException;
}
