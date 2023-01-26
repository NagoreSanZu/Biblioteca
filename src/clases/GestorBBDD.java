package clases;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD {
	
	public void insertarLibro(Libro libro) throws SQLException, ClassNotFoundException {
		Conector conex =new Conector();
		conex.Conexion();
		
		PreparedStatement pstInsert=conex.getConexion().prepareStatement("INSERT INTO libros ( titulo, autor, num_pag ) VALUES(?,?,?)");
		pstInsert.setString(1,libro.getTitulo() );
		pstInsert.setString(2, libro.getAutor());
		pstInsert.setInt(3,libro.getNum_pag() );
		pstInsert.execute();
		conex.cerrarConexion();
	}
	
	public void eliminarLibro(int id) throws SQLException, ClassNotFoundException {
		Conector conex =new Conector();
		conex.Conexion();
		Libro libro =new Libro();
		
		PreparedStatement pstDelete=conex.getConexion().prepareStatement("DELETE FROM libros WHERE id =?");
		pstDelete.setInt(1, libro.getId());
		System.out.println("Eliminando libro...");
		pstDelete.execute();
		conex.cerrarConexion();
	}
	
	public Libro getLibro(int id) {
		return null;
		
	}
	
	

}
