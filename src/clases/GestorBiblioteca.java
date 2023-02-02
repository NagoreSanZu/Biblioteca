package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {
	Scanner scan = new Scanner(System.in);
	public void run() throws NumberFormatException, ClassNotFoundException, SQLException {
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
				System.out.println("ins prestamo");
				break;
			case Menu.SALIR:
				System.out.println("agur");
			
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
	}//fin run
}//fin clase
