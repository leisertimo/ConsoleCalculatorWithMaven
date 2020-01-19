package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Timo Leiser
 * @date   18.01.2020
 */
public class CalculatorTest {
	Calculator testee;
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubtraktionZweiNegativeIsOk() {
		assertTrue(testee.subtraktion(-25, -10) == -15);
	}
	
	@Test
	public void testSubtraktionEinePositiveUndEineNegativeIsOk() {
		assertTrue(testee.subtraktion(25, -10) == 35);
	}
	
	@Test
	public void testSubtraktionMaxValueUndPositiveIsOk() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 100) == 2147483547);
	}
	
	@Test
	public void testSubtraktionMinValueUndNegativeIsOk() {
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, -100) == -2147483548);
	}
	
	@Test
	public void testSubtraktionPositiveUndZeroIsOk() {
		assertTrue(testee.subtraktion(25, 0) == 25);
	}
}