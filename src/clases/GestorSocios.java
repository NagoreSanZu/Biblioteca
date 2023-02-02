package clases;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) throws SQLException, ClassNotFoundException {
		int opcionSocio;
		GestorBBDD gestorBases= new GestorBBDD();
		FormularioDeDatos formulario =new FormularioDeDatos();
		Visor visor = new Visor();

		do {
			Menu.menuSocios();
			opcionSocio=Integer.parseInt(scan.nextLine());
			
			switch(opcionSocio){
			
			case Menu.INSERTAR_SOCIO:
				gestorBases.Conexion();
				Socio SocioInsert=formulario.pedirDatosSocio(scan);
				gestorBases.insertarSocio(SocioInsert);
				gestorBases.cerrarConexion();
				break;
			
			case Menu.ELIMINAR_SOCIO:
				gestorBases.Conexion();
				int idElim=formulario.pedirIdSocio(scan);
				gestorBases.eliminarSocio(idElim);
				gestorBases.cerrarConexion();
				break;
			
			case Menu.MODIFICAR_SOCIO:
				gestorBases.Conexion();
				System.out.println("escribe el id del socio que quieras modificar");
				int idSocio= Integer.parseInt(scan.nextLine());
				Socio socioMod = formulario.ModificarDatosSocio(gestorBases.getSocio(idSocio), scan);
				gestorBases.modificarSocio(socioMod);
				gestorBases.cerrarConexion();
				break;
				
			case Menu.VER_SOCIO:
				gestorBases.Conexion();
				visor.mostrarSocios(gestorBases.VerSociosArray());
				gestorBases.cerrarConexion();

				
				break;
			case Menu.SALIR:
				System.out.println("agur");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}//fin switch
		}  while(opcionSocio != Menu.SALIR);//fin do
	}
}//fin clase
