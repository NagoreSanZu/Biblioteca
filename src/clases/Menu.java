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
	

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU-------");
			System.out.println(GESTIONAR_LIBROS + ".Gestionar Libros");
			System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
			System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case GESTIONAR_LIBROS:
				menuLibros();
				break;
				
			case GESTIONAR_SOCIOS:
				
				menuSocios();
				break;
			case GESTIONAR_PRESTAMOS:
				menuPrestamo();
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();
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
