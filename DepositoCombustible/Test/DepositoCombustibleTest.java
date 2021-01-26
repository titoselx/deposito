import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoMax() {


		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double test = tank.getDepositoMax();
		
		assertSame(40.0,test);
		
	}

}
