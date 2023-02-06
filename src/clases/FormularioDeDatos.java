package clases;

import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class FormularioDeDatos {

	public static Libro pedirDatosLibro(Scanner scan) {
		System.out.println("Cual es el titulo del libro?");
		String tituloLibro = scan.nextLine();
		System.out.println("Cual es el autor del libro");
		String autorLibro = scan.nextLine();
		System.out.println("Cuantos numeros de paginas tiene ?");
		int num_pagLibro = Integer.parseInt(scan.nextLine());
		
		Libro libro = new Libro();
		libro.setTitulo(tituloLibro);
		libro.setAutor(autorLibro);
		libro.setNum_pag(num_pagLibro);
		return libro;
		
	}
	
	public static Libro ModificarDatosLibro(Libro libro, Scanner scan) {
		
		
		System.out.println("Cual es el titulo del libro? ");
		String tituloLibroMod = scan.nextLine();
		System.out.println("Cual es el autor del libro");
		String autorLibroMod = scan.nextLine();
		System.out.println("Cuantos numeros de paginas tiene ?");
		int num_pagLibroMod = Integer.parseInt(scan.nextLine());
		
		libro.setTitulo(tituloLibroMod);
		libro.setAutor(autorLibroMod);
		libro.setNum_pag(num_pagLibroMod);
		
		
		
		return libro;
	}
	
	public static int pedirIdLibros(Scanner scan) {
		Libro libro = new Libro();
		System.out.println("Indica el id del libro que quieras pedir");
		int idLibro = Integer.parseInt(scan.nextLine());
		libro.setId(idLibro);
			return libro.getId();
	}
	

	
//A PARTIR DE AQUI ES PARA SOCIOS -------------------------------------------------------------------------

	
	public static Socio pedirDatosSocio(Scanner scan) {
		
		System.out.println("PEDIR DATOS DEL SOCIO , PORFAVOR INTRODUZCA LOS SIGUIENTES DATOS:");
		System.out.println("Cual es el nombre del socio");
		String nombreSocio =scan.nextLine();
		System.out.println("Cual es el apellido del socio?");
		String apellidoSocio = scan.nextLine();
		System.out.println("Cual es la direccion del socio ??");
		String direccionSocio = scan.nextLine();
		System.out.println("Cual es la poblacion del socio?");
		String poblacionSocio = scan.nextLine();
		System.out.println("Cual es la provincia del socio ?");
		String provinciaSocio= scan.nextLine();
		System.out.println("Cual es el dni del socio??");
		String dniSocio = scan.nextLine();
		
		Socio socio= new Socio ();
		socio.setNombre(nombreSocio);
		socio.setApellido(apellidoSocio);
		socio.setDireccion(direccionSocio);
		socio.setPoblacion(poblacionSocio);
		socio.setProvincia(provinciaSocio);
		socio.setDni(dniSocio);
		return socio;
		
	}
	
public static Socio ModificarDatosSocio(Socio socio, Scanner scan) {
		
		
	System.out.println("MODIFICAR DATOS DEL SOCIO , PORFAVOR INTRODUZCA LOS SIGUIENTES DATOS:");
	System.out.println("Cual es el nombre del socio");
	String nombreSocio =scan.nextLine();
	System.out.println("Cual es el apellido del socio?");
	String apellidoSocio = scan.nextLine();
	System.out.println("Cual es la direccion del socio ??");
	String direccionSocio = scan.nextLine();
	System.out.println("Cual es la poblacion del socio?");
	String poblacionSocio = scan.nextLine();
	System.out.println("Cual es la provincia del socio ?");
	String provinciaSocio= scan.nextLine();
	System.out.println("Cual es el dni del socio??");
	String dniSocio = scan.nextLine();
	
	socio.setNombre(nombreSocio);
	socio.setApellido(apellidoSocio);
	socio.setDireccion(direccionSocio);
	socio.setPoblacion(poblacionSocio);
	socio.setProvincia(provinciaSocio);
	socio.setDni(dniSocio);
	return socio;
	}
	
public static int pedirIdSocio(Scanner scan) {
	Socio socio = new Socio();
	System.out.println("Indica el id del libro que quieras pedir");
	int idLibro = Integer.parseInt(scan.nextLine());
	socio.setId(idLibro);
		return socio.getId();
}	
	
	
//A PARTIR DE AQUI ES PARA PRESTAMOS -------------------------------------------------------------------------

public static Prestamo pedirDatosPrestamo(Scanner scan) throws ParseException {
	SimpleDateFormat formatoLectura1 = new SimpleDateFormat("dd-MM-yyyy");
	System.out.println("Cual es el id del libro?");
	int idLibroPres= Integer.parseInt(scan.nextLine());
	System.out.println("Cual es el id del socio?");
	int idSocioPres= Integer.parseInt(scan.nextLine());
	System.out.println("Escribe una fecha en formato dd-MM-yyyy (ejmplo: 23-01-2020)");
	String fechaFact= scan.nextLine();
	Date fechaLeida = formatoLectura1.parse(fechaFact);
	
	boolean devueltoPres =false;
	
	
	Prestamo prestamo = new Prestamo();
	
	prestamo.setId_libro(idLibroPres);
	prestamo.setId_socio(idSocioPres);
	prestamo.setFecha(fechaLeida);
	prestamo.setDevuelto(devueltoPres);
	
	return prestamo;
	
}

}//fin clase

