import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test

	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoNivel();
		
		assertSame(0.0,test);
	}

	public void testGetDepositoMax() {


		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoMax();
		
		assertSame(40.0,test);
		
	}
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(10.0);
		
		assertSame(10.0,tank.getDepositoNivel());
		assertNotSame(0.0, tank.getDepositoNivel());
	}
	
	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(10.0);
		
		assertTrue(tank.estaVacio());
		assertFalse(tank.estaVacio());
		

	}

}
