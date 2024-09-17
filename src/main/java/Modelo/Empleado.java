package Modelo;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable{
	
	protected int celular;
	protected String correo;
	protected String cargo;
	
	public Empleado(int celular, String correo, String cargo, int id, String nombre, String apellido) {
		super(id, nombre, apellido);
		this.celular = celular;
		this.correo = correo;
		this.cargo = cargo;
	}

}
