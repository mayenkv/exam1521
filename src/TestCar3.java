import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar3 {

	@Test
	public void test() {
		Car c= new Car();
		c.setEngineCapacity(120);
		assertTrue(100<c.getEngineCapacity());
	}

}
