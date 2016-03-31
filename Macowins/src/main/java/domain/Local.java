package domain;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Local {

	private List<Venta> ventas;
	
	public Local(){
		
		ventas = new ArrayList<Venta>();
	}
	
	
	public void addVenta(Venta venta)
	{
		ventas.add(venta);
	}
	
	public double gananciasDelDia(LocalDate fecha)
	{
		return ventas.stream().filter(p -> p.getFecha() == fecha).mapToDouble(p -> p.ganancia()).sum();			
	}	
}
