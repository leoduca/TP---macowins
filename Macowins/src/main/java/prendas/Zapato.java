package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public class Zapato extends Prenda{

	private int talle;
	
	public Zapato(IOrigen origen, IMarca marca, int talle) {
		super(origen, marca);
		this.talle = talle;
	}

	@Override
	public double precioBase() {
		return 400 + 5 * talle;
	}
	

}
