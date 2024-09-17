package Modelo;

public class Venta {

	protected int id;
	protected Cliente cliente;
	protected Empleado vendedor;
	protected Vehiculo vehiculo;
	protected int monto;
	
	public Venta(int id, Cliente cliente, Empleado vendedor, Vehiculo vehiculo, int monto) {
		this.id = id;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.monto = monto;
	}
}
