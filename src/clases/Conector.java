package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {
	private static final String HOST = "localHost";
	private static final String BBDD ="eh_garden";
	private static final String USERNAME = "root";
	private static final String PASSWROD = "";
	
	
	public void Conexion() throws ClassNotFoundException, SQLException {
		Connection conexion;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conexion= DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD, USERNAME, PASSWROD);
		Statement st = conexion.createStatement();
	}
	
}
