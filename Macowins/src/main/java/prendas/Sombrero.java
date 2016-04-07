package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public class Sombrero extends Prenda {

	private double coeficienteDeMetrosexualidad;
	
	public Sombrero(IOrigen origen, IMarca marca, double coeficienteDeMetrosexualidad) {
		super(origen, marca);
		this.coeficienteDeMetrosexualidad = coeficienteDeMetrosexualidad;
	}

	@Override
	public double precioBase() {
		return 150 * (1 + coeficienteDeMetrosexualidad);
	}

}