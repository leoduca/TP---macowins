package marcas;

public class Armani implements IMarca {
	
	@Override
	public double aplicarCoeficienteDeMarca(double importe) {
		return importe * 1.65;
	}

}
