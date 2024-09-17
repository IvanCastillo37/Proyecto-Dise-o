package Modelo;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable {

	protected int edad;
	protected String genero;
	
	public Cliente(int edad, String genero, int id, String nombre, String apellido) {
		super(id, nombre, apellido);
		this.edad = edad;
		this.genero = genero;
	}
}
