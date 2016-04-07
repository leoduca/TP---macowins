package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public class Saco extends Prenda {

	private int cantidadDeBotones;
	
	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return 300 + 10*cantidadDeBotones;
	}
	
	public Saco(IOrigen origen, IMarca marca, int cantidadDeBotones) {
		super(origen, marca);		
		this.cantidadDeBotones = cantidadDeBotones;
	}
}