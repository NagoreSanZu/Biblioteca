package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conector {
	private static final String HOST = "localHost";
	private static final String BBDD ="biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	Connection conexion;
	
	
	//getter and setters
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	//

	public void Conexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD, USERNAME, PASSWORD);
//        con = (Connection) DriverManager.getConnection(url, "root", "");
    }
	
	public void cerrarConexion() throws SQLException {
		conexion.close();
		
	}
}
