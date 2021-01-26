import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoNivel();
		
		assertSame(0.0,test);
		
	}

}
