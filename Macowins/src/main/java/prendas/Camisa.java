package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public class Camisa extends Prenda {

	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	public Camisa(IOrigen origen, IMarca marca) {
		super(origen, marca);		
	}

}
