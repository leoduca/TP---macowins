package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public abstract class Prenda {
	
	private static final int VALOR_FIJO = 100;
	private IOrigen origen;
	private IMarca marca;
	
	
	public Prenda(IOrigen origen, IMarca marca){
		this.origen = origen;	
		this.marca = marca;
	}
	
	public double precioFinal() {
		return origen.aplicarTasaDeImportacion(
				marca.aplicarCoeficienteDeMarca(
						VALOR_FIJO + this.precioBase()
						)
				);
	}
	
	public abstract double precioBase();

}