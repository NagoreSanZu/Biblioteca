package clases;

import java.util.Scanner;

public class FormularioDeDatos {

	public static Libro pedirDatosLibro(Scanner scan) {
		System.out.println("Cual es el titulo del libro?");
		String tituloLibro = scan.nextLine();
		System.out.println("Cual es el autor del libro");
		String autorLibro = scan.nextLine();
		System.out.println("Cuantas numeros de paginas tiene ?");
		int num_pagLibro = Integer.parseInt(scan.nextLine());
		
		Libro libro = new Libro();
		return libro;
		
	}
	
}
