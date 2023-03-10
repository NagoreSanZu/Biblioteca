package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) throws ClassNotFoundException, SQLException, NumberFormatException {
		int opcionLibro;
		GestorBBDD gestorBases= new GestorBBDD();
		FormularioDeDatos formulario =new FormularioDeDatos();
		Visor visor = new Visor();

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
				gestorBases.Conexion();
				int idElim=formulario.pedirIdLibros(scan);
				gestorBases.eliminarLibro(idElim);
				gestorBases.cerrarConexion();
				break;
			
			case Menu.MODIFICAR_LIBRO:
				gestorBases.Conexion();
				System.out.println("escribe el id del libro");
				int idLibro= Integer.parseInt(scan.nextLine());
				Libro libroMod = formulario.ModificarDatosLibro(gestorBases.getLibro(idLibro), scan);
				gestorBases.modificarLibro(libroMod);
				gestorBases.cerrarConexion();
				break;
				
			case Menu.VER_LIBROS:
				gestorBases.Conexion();
				visor.mostrarLibros(gestorBases.VerLibrosArray());
				gestorBases.cerrarConexion();

				
				break;
			case Menu.SALIR:
				System.out.println("agur");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
	}//fin run 
}//fin clase

