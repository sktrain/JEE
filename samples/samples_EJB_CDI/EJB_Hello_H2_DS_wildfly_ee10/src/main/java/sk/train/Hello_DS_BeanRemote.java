package sk.train;

import java.sql.SQLException;

import jakarta.ejb.Remote;

@Remote
public interface Hello_DS_BeanRemote {
	
	public String getDatasource() throws SQLException;
}
