package domain;

public class Saco extends Prenda {

	@Override
	public int precioBase() {
		// TODO Auto-generated method stub
		return 300;
	}
	
	public Saco(boolean esImportado) {
		super(esImportado);		
	}
}
