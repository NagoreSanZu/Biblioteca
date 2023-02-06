package clases;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorPrestamo {
 public void run (Scanner scan) throws SQLException, ClassNotFoundException, ParseException {
	 int opcionLibro;
		GestorBBDD gestorBases= new GestorBBDD();
		FormularioDeDatos formulario =new FormularioDeDatos();
		Visor visor = new Visor();

		do {
			Menu.menuPrestamo();
			opcionLibro=Integer.parseInt(scan.nextLine());
			
			switch(opcionLibro){
			
			case Menu.INSERTAR_PRESTAMO:
				gestorBases.Conexion();
				Prestamo InserPrest=formulario.pedirDatosPrestamo(scan);
				gestorBases.insertarPrestamo(InserPrest);
				gestorBases.cerrarConexion();
				System.out.println("Prestamo hecho");
				break;
			
			case Menu.ENTREGAR_PRESTAMO:
				gestorBases.Conexion();
				Prestamo datos=formulario.retirarPrestamo(scan);
				gestorBases.modificarPrestamo(datos);
				gestorBases.cerrarConexion();
				
				System.out.println("Prestamo entregado");
				break;
			
//			case Menu.MODIFICAR_LIBRO:
//				gestorBases.Conexion();
//				System.out.println("escribe el id del libro");
//				int idLibro= Integer.parseInt(scan.nextLine());
//				Libro libroMod = formulario.ModificarDatosLibro(gestorBases.getLibro(idLibro), scan);
//				gestorBases.modificarLibro(libroMod);
//				gestorBases.cerrarConexion();
//				break;
//				
//			case Menu.VER_LIBROS:
//				gestorBases.Conexion();
//				visor.mostrarLibros(gestorBases.VerLibrosArray());
//				gestorBases.cerrarConexion();
//
//				
//				break;
			case Menu.SALIR:
				System.out.println("agur");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionLibro != Menu.SALIR);//fin do
 }
}
