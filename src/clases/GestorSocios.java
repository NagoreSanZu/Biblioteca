package clases;

import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) {
		int opcionSocio;
		GestorBBDD gestorBases= new GestorBBDD();
		FormularioDeDatos formulario =new FormularioDeDatos();
		Visor visor = new Visor();

		do {
			Menu.menuLibros();
			opcionSocio=Integer.parseInt(scan.nextLine());
			
			switch(opcionSocio){
			
			case Menu.INSERTAR_LIBRO:
				gestorBases.Conexion();
				Socio SocioInsert=formulario.pedirDatosSocio(scan);
				gestorBases.insertarSocio(SocioInsert);
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
			
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionSocio != Menu.SALIR);//fin do
}//fin clase
