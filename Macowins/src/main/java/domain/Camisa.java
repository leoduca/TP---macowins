package domain;

public class Camisa extends Prenda {

	@Override
	public int precioBase() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	public Camisa(boolean esImportado) {
		super(esImportado);		
	}

}
