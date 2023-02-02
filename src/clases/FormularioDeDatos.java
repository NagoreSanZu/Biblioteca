package clases;

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
		
		
		System.out.println("Cual es el titulo del libro? (Anterior: " + libro.getTitulo() + ")");
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
	
	
	
}
