package Modelo;

import java.io.Serializable;

public class Persona {//implements Serializable {

	protected int id;
	protected String nombre;
	protected String apellido;
	
	public Persona(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
