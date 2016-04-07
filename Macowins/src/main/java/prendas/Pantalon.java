package prendas;

import marcas.IMarca;
import origenes.IOrigen;

public class Pantalon extends Prenda {
	
	private double telaUsada;
	
	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return 250 + this.telaUsada;
	}
	
	public Pantalon(IOrigen origen, IMarca marca, double telaUsada) {
		super(origen, marca);
		this.telaUsada = telaUsada;
	}
}