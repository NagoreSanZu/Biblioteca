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


//A PARTIR DE AQUI ES PARA SOCIOS -------------------------------------------------------------------------


public static void mostrarSocios(ArrayList<Socio> socios) {

for (Socio so : socios) {
	System.out.println(so);
}
}

public static void mostrarSocio(Socio socio) {
System.out.println(socio);
}


public static void mostradorMensajesSocio(String mensaje) {
System.out.println(mensaje);	
}


}//fin de la clase
