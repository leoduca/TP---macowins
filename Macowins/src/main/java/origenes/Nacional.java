package origenes;

public class Nacional implements IOrigen{

	@Override
	public double aplicarTasaDeImportacion(double importe) {
		return 1 * importe;
	}

}