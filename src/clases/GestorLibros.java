package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) throws ClassNotFoundException, SQLException, NumberFormatException {
		int opcionLibro;
		GestorBBDD gestorBases= new GestorBBDD();
		FormularioDeDatos formulario =new FormularioDeDatos();

		do {
			Menu.menuLibros();
			opcionLibro=Integer.parseInt(scan.nextLine());
			
			switch(opcionLibro){
			
			case Menu.INSERTAR_LIBRO:
				gestorBases.Conexion();
				Libro libroInsert=formulario.pedirDatosLibro(scan);
				gestorBases.insertarLibro(libroInsert);
				gestorBases.cerrarConexion();
				break;
			
			case Menu.ELIMINAR_LIBRO:
				
				break;
			
			case Menu.MODIFICAR_LIBRO:
				gestorBases.Conexion();
				//Libro libroMod = formulario.ModificarDatosLibro(libro, scan);
				
				gestorBases.cerrarConexion();
				break;
			case Menu.SALIR:
				System.out.println("agur");
			
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
	}//fin run 
}//fin clase

