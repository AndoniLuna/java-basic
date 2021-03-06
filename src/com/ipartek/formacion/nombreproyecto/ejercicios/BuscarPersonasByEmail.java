package com.ipartek.formacion.nombreproyecto.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Ejercicio para buscar en la tabla 'persona' todas las que contenga su email
 * la cadena de texto "spambob"
 * 
 * @author ur00
 *
 */
public class BuscarPersonasByEmail {

	// CONSTANTES PARA CONEXION DE BBDD
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String SERVER = "127.0.0.1";
	private static final String DATABASE = "javabasic";
	private static final String USER = "root";
	private static final String PASS = "";
	private static final String PORT = "3306";
	static String consulta = "select id, nombre, email from persona where email like '%spambob%';";

	public static void main(String[] args) throws Exception {

		
		Class.forName(DRIVER);
		Connection conexion = DriverManager.getConnection("jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE, USER, PASS);
		
		PreparedStatement pst = conexion.prepareStatement(consulta);
		
		ResultSet rs = pst.executeQuery();
		
		while ( rs.next() ){
			
			System.out.println("id: " + rs.getInt("id") );
			System.out.println("nombre: " + rs.getString("nombre") );
			System.out.println("email: "  + rs.getString("email") );
			System.out.println("--------------------------------" );
		}
		
		rs.close();
		pst.close();
		conexion.close();
		
	}

}
