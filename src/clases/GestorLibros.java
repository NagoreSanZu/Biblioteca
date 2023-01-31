package clases;

import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) {
		int opcionLibro;


		do {
			Menu.menuLibros();
			opcionLibro=Integer.parseInt(scan.nextLine());
			
			switch(opcionLibro){
			
			case Menu.INSERTAR_LIBRO:
				System.out.println("ins socio");
				break;
			
			case Menu.ELIMINAR_LIBRO:
				System.out.println("ins socio");
				break;
			
			case Menu.MODIFICAR_LIBRO:
				System.out.println("ins socio");
				break;
			
			
				
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
	}//fin run 
}//fin clase

