package Concesionario;

import Controlador.ControladorGeneral;
import java.util.Scanner;

public class App {
	
	
	 public static void main(String[] args) {
	 
 
		 Scanner scanner = new Scanner(System.in);
		 boolean menuPrincipal = true;
		 
		 while(menuPrincipal) {
			 System.out.println("Menú Principal");
			 System.out.println("1. Vender");
			 System.out.println("2. Administrar");
			 System.out.println("3. Salir");
			 System.out.println("Elige una opción: ");
			 
			 int opcionPrincipal = scanner.nextInt();
			 
			 switch(opcionPrincipal) {
			 case 1://opcion para realizar una venta
				 System.out.println("Ingrese su codigo");
				 int idEmpleado = scanner.nextInt();
				 String cargo = ControladorGeneral.validarCargo(idEmpleado);
				 if(!cargo.equals(null) && cargo.equals("vendedor")) {
					 ControladorGeneral.productosDisponibles();
					 int producto = 0;
					 int contador = 0;
					 do {
						 System.out.println("Selccione un producto");
						 System.out.println("0. para confirmar compra");
						 producto = scanner.nextInt();
						 contador += ControladorGeneral.porductoEspecifico(producto);
						 System.out.println("Total: " + contador);
					 }while(producto != 0);
				 }else {
					 System.out.println("codigo no valido");
				 }
			 case 2:
				 //Administrar
			 case 3:
				 //Salir
			 default:
				 //System.out.println("Opción no válida.");
			 }
		 }
	 }
}
