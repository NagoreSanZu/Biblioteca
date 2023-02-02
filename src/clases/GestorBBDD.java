package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBBDD extends Conector {
	
	public  void insertarLibro(Libro libro) throws SQLException {
	
		
		PreparedStatement pstInsert=super.conexion.prepareStatement("INSERT INTO libros ( titulo, autor, num_pag ) VALUES(?,?,?)");
		pstInsert.setString(1,libro.getTitulo() );
		pstInsert.setString(2, libro.getAutor());
		pstInsert.setInt(3,libro.getNum_pag() );
		pstInsert.execute();
		
	}
	
	public void eliminarLibro(int id) throws SQLException {
		Libro libro =new Libro();
		
		PreparedStatement pstDelete=super.conexion.prepareStatement("DELETE FROM libros WHERE id =?");
		pstDelete.setInt(1, libro.getId());
		System.out.println("Eliminando libro...");
		pstDelete.execute();
		
	}
	
	
	public void modificarLibro(Libro libro) throws SQLException {
		

		PreparedStatement pstInsert=super.conexion.prepareStatement("UPDATE libros SET titulo=?, autor=?, num_pag=? WHERE id=?");
		pstInsert.setString(1,libro.getTitulo() );
		pstInsert.setString(2, libro.getAutor());
		pstInsert.setInt(3,libro.getNum_pag() );
		pstInsert.setInt(4, libro.getId());
		pstInsert.execute();
	}
	
	public  Libro getLibro(int id) throws SQLException {
		PreparedStatement pstSelect=super.conexion.prepareStatement("SELECT * FROM libros WHERE id =?");
		pstSelect.setInt(1, id);
		ResultSet rs=pstSelect.executeQuery();
		rs.next();
		Libro libro = new Libro();
		libro.setId(rs.getInt("id"));
		libro.setTitulo(rs.getString("titulo"));
		libro.setAutor(rs.getNString("autor"));
		libro.setNum_pag(rs.getInt("num_pag"));
		return libro;
		
	}
	
	

}
