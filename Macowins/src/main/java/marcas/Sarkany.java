package marcas;

public class Sarkany implements IMarca {
	
	@Override
	public double aplicarCoeficienteDeMarca(double importe) {
		return importe * (importe > 500 ? 1.35 : 1.1);
	}

}
