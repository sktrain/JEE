package sk.train;

import java.sql.SQLException;

//@Remote
public interface Hello_DS_BeanRemote {
	
	public String getDatasource() throws SQLException;
}
