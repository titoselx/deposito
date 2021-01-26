import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		tank.fill(10.0);
		
		assertSame(10.0,tank.getDepositoNivel());
		assertNotSame(0.0, tank.getDepositoNivel());
	}

}
