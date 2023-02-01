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
				System.out.println("ins socio");
				break;
			
			case Menu.GESTIONAR_SOCIOS:
				System.out.println("ins socio");
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
