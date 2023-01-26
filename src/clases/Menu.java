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
				System.out.println("segunda opcion seleccionada\n");
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
	
}
