package ch.bbw.consolecalculator;

/**
 * Calculator 
 * - kann zwei Zahlen addieren
 * 
 * @author Timo Leiser
 * @date 18.01.2020
 *
 */

public class Calculator {

	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int subtraktion(int minuend , int subtrahend) {
		return minuend - subtrahend;
	}
	
	public double division(double dividend, double divisor) {
		return dividend / divisor;
	}
	
	protected double quadratwurzel(double value1) {
		return Math.sqrt(value1);
	}
	
	double malPi(double value) {
		return value * Math.PI;
	}
	
	private double quadrat(double value) {
		return value * value;
	}
	
	public double zinsesZins(double kapital, double jahre, double zinssatz) {

		double zinsesZins;
		double endKap;
 
		for(int i = (int) jahre; i >= 1; i--) {			
			zinsesZins = (kapital * 1 * zinssatz) / 100;
			kapital = kapital + zinsesZins;
		}
	      endKap = kapital;
	      
	      System.out.println(endKap);
	      return endKap;
	  }  
}