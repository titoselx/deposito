import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
<<<<<<< HEAD
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoNivel();
		
		assertSame(0.0,test);
=======
	public void testGetDepositoMax() {


		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoMax();
		
		assertSame(40.0,test);
>>>>>>> refs/heads/testGetDepositoMax
		
	}

}
