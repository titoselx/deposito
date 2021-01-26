import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	
	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(10.0);
		
		assertTrue(tank.estaVacio());
		assertFalse(tank.estaVacio());
		
	}

}
