import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar2 {

	@Test
	public void test() {
		Car c= new Car();
		c.setEngineCapacity(120);
		assertEquals(100,c.getEngineCapacity());
	}

}
