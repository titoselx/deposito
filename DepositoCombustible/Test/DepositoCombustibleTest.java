import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(25.0);
		tank.consumir(10.0);
		
		assertSame(15.0,tank.getDepositoNivel());
		assertNotSame(10.0, tank.getDepositoNivel());
	}

}
