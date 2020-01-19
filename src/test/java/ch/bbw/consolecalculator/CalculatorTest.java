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
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-10, -25) == -35);
	}
	
	@Test
	public void testSummeEinePositiveUndEineNegativeIsOk() {
		assertTrue(testee.summe(10, -25) == -15);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionDividedByZeroIsNOk() {
		testee.division(10, 0);
	}
	
	@Test
	public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(10, 2) == 5);
	}
	
	@Test //protected
	public void testWurzelEinePositiveOk() {
		assertTrue(testee.quadratwurzel(64) == 8);
	}
	
	@Test //package
	public void testMalPiEinePositiveOk() {
		//kann man nicht testen wegen Pi
	}
	
	@Test //private deshalb kann es nicht getestet werden
	public void testQuadratEinePositiveOk() {
		//return
	}

}