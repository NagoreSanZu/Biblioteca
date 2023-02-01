package clases;

import java.util.Scanner;

public class GestorBiblioteca {
	public void run(Scanner scan) {
		int opcionLibro;

		do {
			Menu.menuPrincipal();
			opcionLibro=Integer.parseInt(scan.nextLine());
			
			switch(opcionLibro){
			
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;
			
			case Menu.GESTIONAR_PRESTAMOS:
				System.out.println("ins socio");
				break;
			case Menu.SALIR:
				System.out.println("agur");
			
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
	}
}
