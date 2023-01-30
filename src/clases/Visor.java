package clases;

import java.util.ArrayList;

public class Visor {
	
public static void mostrarLibros(ArrayList<Libro> libros) {
	
	for (Libro li : libros) {
		System.out.println(li);
	}
}
}
