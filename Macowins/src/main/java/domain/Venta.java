package domain;
import java.time.LocalDate;

import prendas.Prenda;

public class Venta {
	
	private Prenda prenda;
	private int cantidad;
	private LocalDate fecha;
	
	/* Constructor */
	public Venta(Prenda prenda, int cantidad)
	{
		this(prenda, cantidad, LocalDate.now());
	}
	
	public Venta(Prenda prenda, int cantidad, LocalDate fecha)
	{
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	
	/* Getters */
	
	public Prenda getPrenda() {
		return prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public LocalDate getFecha()
	{
		return this.fecha;
	}

	public double ganancia()
	{
		return prenda.precioFinal()*this.cantidad;
	}
	

}
