package clases;

import java.util.Scanner;

public class Menu {
	static final int GESTIONAR_LIBROS = 1;
	static final int GESTIONAR_SOCIOS = 2;
	static final int GESTIONAR_PRESTAMOS = 3;
	static final int SALIR = 0;

	static final int INSERTAR_LIBRO=1;
	static final int ELIMINAR_LIBRO=2;
	static final int MODIFICAR_LIBRO=3;



	public void menuPrincipal() {
	
		System.out.println("Gestionar Libros");
		System.out.println("Gestionar Socios");
		System.out.println("Gestionar Prestamos");
	}

	public void menuPrestamo() {
		System.out.println("1-Realizar un prestamo");
	}

	public void menuSocios() {
		System.out.println("1-Ver socios");
	}

	public void menuLibros() {
		System.out.println("1-Insertar libro");
		System.out.println("2- Eliminar libro");
		System.out.println("3- Ver libros");
	}
	
}
