package clases;

import java.sql.SQLException;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, ClassNotFoundException, SQLException, ParseException {
		GestorBiblioteca gestor =new  GestorBiblioteca();
		gestor.run();
	}
	
}
