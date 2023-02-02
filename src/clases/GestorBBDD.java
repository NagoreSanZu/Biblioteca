package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBBDD extends Conector {
	
	public  void insertarLibro(Libro libro) throws SQLException {
	
		
		PreparedStatement pstInsert=super.conexion.prepareStatement("INSERT INTO libros ( titulo, autor, num_pag ) VALUES(?,?,?)");
		pstInsert.setString(1,libro.getTitulo() );
		pstInsert.setString(2, libro.getAutor());
		pstInsert.setInt(3,libro.getNum_pag() );
		pstInsert.execute();
		
	}
	
	public void eliminarLibro(int id) throws SQLException {
		
		PreparedStatement pstDelete=super.conexion.prepareStatement("DELETE FROM libros WHERE id =?");
		pstDelete.setInt(1, id);
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
	
	public ArrayList VerLibrosArray() throws SQLException {
		String senteciaSelect = "SELECT * FROM libros";
		Statement st = super.conexion.createStatement();
		ArrayList<Libro> libros= new ArrayList <Libro>();

		ResultSet resultado =st.executeQuery(senteciaSelect);
		while(resultado.next()) {
			
			Libro libro=new Libro();
			
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getNString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
			
			libros.add(libro);
		}
		return libros;
	}
	
	
//A PARTIR DE AQUI ES PARA SOCIOS -------------------------------------------------------------------------

public  void insertarSocio(Socio socio) throws SQLException {
	
		
		PreparedStatement pstInsert=super.conexion.prepareStatement("INSERT INTO socios ( nombre=?, apellido=?, direccion=?, poblacion,provincia, dni) VALUES(?,?,?,?,?,?)");
		pstInsert.setString(1,socio.getNombre() );
		pstInsert.setString(2, socio.getApellido());
		pstInsert.setString(3,socio.getDireccion() );
		pstInsert.setString(4,socio.getPoblacion() );
		pstInsert.setString(5,socio.getProvincia() );
		pstInsert.setString(6,socio.getDni() );
		pstInsert.execute();
		
	}


public void eliminarSocio(int id) throws SQLException {
	
	PreparedStatement pstDelete=super.conexion.prepareStatement("DELETE FROM socios WHERE id =?");
	pstDelete.setInt(1, id);
	System.out.println("Eliminando Socio...");
	pstDelete.execute();
	
}


public void modificarSocio(Socio socio) throws SQLException {
	

	PreparedStatement pstInsert=super.conexion.prepareStatement("UPDATE socios SET  nombre=?, apellido,=? direccion=?, poblacion=?,provincia=?, dni=? WHERE id=?");
	pstInsert.setString(1,socio.getNombre() );
	pstInsert.setString(2, socio.getApellido());
	pstInsert.setString(3,socio.getDireccion() );
	pstInsert.setString(4,socio.getPoblacion() );
	pstInsert.setString(5,socio.getProvincia() );
	pstInsert.setString(6,socio.getDni() );
	pstInsert.setInt(7,socio.getId());

	pstInsert.execute();
}

public  Socio getSocio(int id) throws SQLException {
	PreparedStatement pstSelect=super.conexion.prepareStatement("SELECT * FROM socios WHERE id =?");
	pstSelect.setInt(1, id);
	ResultSet rs=pstSelect.executeQuery();
	rs.next();
	Socio socio=new Socio();
	socio.setId(rs.getInt("id"));
	socio.setNombre(rs.getString("nombre"));
	socio.setApellido(rs.getString("apellido"));
	socio.setDireccion(rs.getString("direccion"));
	socio.setPoblacion(rs.getString("poblacion"));
	socio.setProvincia(rs.getString("provincia"));
	socio.setDni(rs.getString("dni"));
	return socio;
	
}

public ArrayList VerSociosArray() throws SQLException {
	String senteciaSelect = "SELECT * FROM socios";
	Statement st = super.conexion.createStatement();
	ArrayList<Socio> socios= new ArrayList <Socio>();

	ResultSet resultado =st.executeQuery(senteciaSelect);
	while(resultado.next()) {
		
		Socio socio=new Socio();
		
		socio.setId(resultado.getInt("id"));
		socio.setNombre(resultado.getString("nombre"));
		socio.setApellido(resultado.getString("apellido"));
		socio.setDireccion(resultado.getString("direccion"));
		socio.setPoblacion(resultado.getString("poblacion"));
		socio.setProvincia(resultado.getString("provincia"));
		socio.setDni(resultado.getString("dni"));

		socios.add(socio);
	}
	return socios;
}





}//fin clase
