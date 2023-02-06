package clases;

import java.util.Scanner;

public class Menu {
	
	//MENY GENERA
	static final int GESTIONAR_LIBROS = 1;
	static final int GESTIONAR_SOCIOS = 2;
	static final int GESTIONAR_PRESTAMOS = 3;
	
	//ESTA VARIABLE SIRVER PARA TODOS LOS MENOS Y SUBMENUS
	static final int SALIR = 0;

	//SOCIO
	static final int INSERTAR_SOCIO=1;
	static final int ELIMINAR_SOCIO=2;
	static final int MODIFICAR_SOCIO=3;
	static final int VER_SOCIO=4;
	//LIBRO
	static final int INSERTAR_LIBRO=1;
	static final int ELIMINAR_LIBRO=2;
	static final int MODIFICAR_LIBRO=3;
	static final int VER_LIBROS=4;
	
	static final int REALIZAR_PRESTAMO =1;
	
	static final int INSERTAR_PRESTAMO=1;
	static final int ELIMINAR_PRESTAMO=2;


	public static void menuPrincipal() {
		System.out.println("-------MENU-------");
		System.out.println("1-Gestionar Libros");
		System.out.println("2-Gestionar Socios");
		System.out.println("3-Gestionar Prestamos");
		System.out.println("0-Salir");

	}

	public static void menuPrestamo() {
		System.out.println("1-Realizar un prestamo");
		System.out.println("1-Eliminar prestamo");

	}

	public static void menuSocios() {
		System.out.println("1-Insertar socio");
		System.out.println("2-Eliminar socio");
		System.out.println("3-Modificar socio");
		System.out.println("4-Ver socio");
		System.out.println("0-Salir");
	}

	public static void menuLibros() { 
		System.out.println("1-Insertar libro");
		System.out.println("2-Eliminar libro");
		System.out.println("3-Modificar libros");
		System.out.println("4-Ver libros");
		System.out.println("0-Salir");
	}
	
}
