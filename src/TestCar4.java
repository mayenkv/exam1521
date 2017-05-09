import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar4 {

	@Test
	public void test() {
		Car c= new Car();
		c.setEngineCapacity(120);
		assertFalse(130<c.getEngineCapacity());
	}

}
