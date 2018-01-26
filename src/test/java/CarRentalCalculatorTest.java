import static org.junit.Assert.*;

import org.junit.Test;

public class CarRentalCalculatorTest {

	@Test
	//TC1 : First timer, Honda Fit, 1 Day, expect $61.75
	public void testTC1() {
		assertEquals("TC1 failed", CarRentalCalculator.carRental("Honda", 1, true, false), 61.75, 0.00);
	}
	
	@Test
	//TC2 : First timer, Toyota Wish, 1 Day, expect $76.00
	public void testTC2() {
		assertEquals("TC2 failed", CarRentalCalculator.carRental("Toyota", 1, true, false), 76.00, 0.00);
	}
	
	@Test
	//TC3 : Member, Honda Fit, 1 Day, expect $58.50
	public void testTC3() {
		assertEquals("TC3 failed", CarRentalCalculator.carRental("Honda", 1, false, true), 58.50, 0.00);
	}
	
	@Test
	//TC4 : Member, Toyota, 1 Day, expect $72.00
	public void testTC4() {
		assertEquals("TC4 failed", CarRentalCalculator.carRental("Toyota", 1, false, true), 72.00, 0.00);
	}

	@Test
	//TC5 : Non-Member, Honda, 5 Days, expect $325.00
	public void testTC5() {
		assertEquals("TC5 failed", CarRentalCalculator.carRental("Honda", 5, false, false), 325.00, 0.00);
	}
	
	@Test
	//TC6 : Member, Toyota, 5 Day, expect $400.00
	public void testTC6() {
		assertEquals("TC6 failed", CarRentalCalculator.carRental("Toyota", 5, false, false), 400.00, 0.00);
	}
	
	@Test
	//TC7 : Member, Honda, 5 Days, expect $260.00
	public void testTC7() {
		assertEquals("TC7 failed", CarRentalCalculator.carRental("Honda", 5, false, true), 260.00, 0.00);
	}
	
	@Test
	//TC8 : Member, Toyota, 5 Day, expect $320.00
	public void testTC8() {
		assertEquals("TC7 failed", CarRentalCalculator.carRental("Toyota", 5, false, true), 320.00, 0.00);
	}
}
