package clases;

import java.util.Scanner;

public class Menu {

	public void menuPrincipal() {
		final int OPCION_GESTIONAR = 1;
		final int OPCION_SOCIOS = 2;
		final int OPCION_PRESTAMOS = 3;
		final int SALIR = 0;

		Scanner scan = new Scanner(System.in);
		int opcion_menu;

		do {
			System.out.println("------MENU-------");
			System.out.println(OPCION_GESTIONAR + ".Gestionar Libros");
			System.out.println(OPCION_SOCIOS + ". Gestionar Socios");
			System.out.println(OPCION_PRESTAMOS + ". Gestionar Prestamos");
			System.out.println(SALIR + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menu = Integer.parseInt(scan.nextLine());

			switch (opcion_menu) {
			case OPCION_GESTIONAR:
				
				break;
				
			case OPCION_SOCIOS:
				menuLibros(scan);
				
				break;
			case OPCION_PRESTAMOS:
				System.out.println("tercera opcion seleccionada\n");
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

	public void menuLibros(Scanner scan) {
		final int OPCION_INSERTAR = 1;
		final int OPCION_ELIMINAR = 2;
		final int OPCION_VER = 3;
		final int SALIR_L = 0;

		int opcion_menuL ;

		do {
			System.out.println("------MENU-------");
			System.out.println(OPCION_INSERTAR + ". Insertar libro");
			System.out.println(OPCION_ELIMINAR + ". Eliminar libro");
			System.out.println(OPCION_VER + ". Ver libros");
			System.out.println(SALIR_L + ". Salir");
			System.out.println("Elije una de las opciones");
			opcion_menuL = Integer.parseInt(scan.nextLine());

			switch (opcion_menuL) {
			case OPCION_INSERTAR:
				System.out.println("primera opcion seleccionada\n");
				break;
			case OPCION_ELIMINAR:
				System.out.println("segunda opcion seleccionada\n");
				break;
			case OPCION_VER:
				System.out.println("tercera opcion seleccionada\n");
				break;
			case SALIR_L:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menuL != SALIR_L);
	}
	
}
