package clases;

import java.util.ArrayList;

public class Visor {
	
public static void mostrarLibros(ArrayList<Libro> libros) {
	
	for (Libro li : libros) {
		System.out.println(li);
	}
}

public static void mostrarLibro(Libro libro) {
	System.out.println(libro);
}


public static void mostradorMensajes(String mensaje) {
System.out.println(mensaje);	
}


}//fin de la clase
