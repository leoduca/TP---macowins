import java.time.LocalDate;
import domain.*;
import org.junit.*;

public class MainTest {	
	
	
	Pantalon levis = new Pantalon(true);
	
	Camisa argenta = new Camisa(false);
	Camisa tomy = new Camisa(true);
	
	Saco sacoNacional = new Saco(false);
	Saco sacoImportado = new Saco(true);	


	@Test
	public void Ganancias(){
		
		LocalDate hoy = LocalDate.now();
		Pantalon argentino = new Pantalon(false);
		Venta venta1 = new Venta(argentino, 2,hoy); 
		
		Local macowins = new Local();	
		
		macowins.addVenta(venta1);		
		double ganancia = macowins.gananciasDelDia(hoy);
		
		System.out.println(ganancia);
		
		Assert.assertEquals(350, macowins.gananciasDelDia(hoy),1);
	}	
}
