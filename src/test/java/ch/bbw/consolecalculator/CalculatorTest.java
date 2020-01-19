package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Timo Leiser
 * @date   18.01.2020
 */
public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-10, -25) == -35);
	}

}