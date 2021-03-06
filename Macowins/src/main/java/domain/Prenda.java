package domain;

public abstract class Prenda {
	
	private int VALOR_FIJO;
	private boolean importada;
	
	public Prenda(boolean imported){
		this.VALOR_FIJO = 100;
		this.importada = imported;	
	}
	
	public boolean isImportada() {
		return importada;
	}

	public void setImportada(boolean importada) {
		this.importada = importada;
	}
	
	public double precioFinal() {
		return ((this.VALOR_FIJO + this.precioBase()) * tasaImportacion());
	}
	
	public double tasaImportacion() {
		return this.importada ? 1.3 : 1; 
	}
	
	public abstract int precioBase();

}
