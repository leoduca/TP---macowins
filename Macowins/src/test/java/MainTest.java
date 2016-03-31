import java.time.LocalDate;
import domain.*;
import org.junit.*;

public class MainTest {	
	

	@Test
	public void Ganancias(){
		
		LocalDate hoy = LocalDate.now();
		Pantalon argentino = new Pantalon(false);
		Venta venta1 = new Venta(argentino, 1,hoy); 
		
		Local macowins = new Local();	
		
		macowins.addVenta(venta1);		
		
		Assert.assertEquals(350, macowins.gananciasDelDia(hoy),1);
	}	
}
