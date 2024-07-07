package sk.train;

import java.sql.Connection;
import java.sql.SQLException;

import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import javax.sql.DataSource;

/**
 * Session Bean implementation class Hello_DS_Bean
 */
@Stateless
public class Hello_DS_Bean implements Hello_DS_BeanRemote {

	// Injizierung der Datasource
	// Voraussetzung: Datasource ist in Wildfly eingerichtet mit dem verwendeten
	// JNDI-Namen
	// Hier ist wichtig!!!: Statt Attribut "name" muss Attribut "lookup" verwendet
	// werden
	// @Resource(lookup="java:/jdbc/OracleDS") //bis Wildfly 10
	// @Resource(lookup="java:/jdbc/H2DS") //bis Wildfly 10

	@Resource(lookup = "java:/H2DS") // ab Wildfly11
	private DataSource ds;

	// so geht es für die DefaultDS, dia auf H2 basiert
	// @Resource(name="ExampleDS")
	// private DataSource ds;

	public Hello_DS_Bean() {
	}

	@Override
	public String getDatasource() throws SQLException {
		Connection con = ds.getConnection();
		//System.err.println(con.getMetaData().getDatabaseProductName());
		return "Datasource: " + ds.getClass().getName() + " \n " + con.getMetaData().getDatabaseProductName();
	}

}
