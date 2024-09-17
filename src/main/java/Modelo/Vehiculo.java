package Modelo;

import java.io.Serializable;

public class Vehiculo implements Serializable {

	protected int id;
	protected String marca;
	protected String modelo;
	protected int año;
	protected float cilindrada;
	
	public Vehiculo(int id, String marca, String modelo, int año, float cilindrada) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.cilindrada = cilindrada;
	}
	
}
