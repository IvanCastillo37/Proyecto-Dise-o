package Controlador;

import Modelo.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ControladorGeneral {

	private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
	private static final String USER = "root";
	private static final String PASSWORD = "Dicapani01";
	
	public static void productosDisponibles() {
		try {
			Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);//Esto deberia ir en el inicio del codigo para no repetirlo
			Statement statement = conexion.createStatement();
			
			String selectSQL = "SELECT * FROM producto";
			ResultSet resultado = statement.executeQuery(selectSQL);
			
			while (resultado.next()) {
				if(resultado.getInt("cantidad") != 0) {
					int id = resultado.getInt("id");
					String nombre = resultado.getString("nombre");
					int valor = resultado.getInt("valor");
					int cantidad = resultado.getInt("cantidad");
					System.out.println("Codigo: " + id + "| Nombre: " + nombre + "| Valor: " + valor);// No muestra la cantidad disponible del producto
				}
			}
			
			resultado.close();
			statement.close();
			conexion.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static int porductoEspecifico (int id) {//Devuelve el valor especifico de un producto
		try {
			Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);//Esto deberia ir en el inicio del codigo para no repetirlo
			Statement statement = conexion.createStatement();
			
			String selectSQL = "SELECT valor FROM producto WHERE id =" + id;
			ResultSet resultado = statement.executeQuery(selectSQL);
			if(resultado.next()) {
				int valor = resultado.getInt("valor");
				resultado.close();
				statement.close();
				conexion.close();
				return valor;
			}
			resultado.close();
			statement.close();
			conexion.close();
			return 0;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
