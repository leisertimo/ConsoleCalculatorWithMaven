package ch.bbw.consolecalculator;

/**
 * Console Calculator App
 * @author Timo Leiser
 * @date   18.01.2020
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int valueA;
		int valueB;
		
		System.out.println("Console Calculator");
		System.out.println("==================");
		System.out.println();
						
		valueA = 10;
		valueB = 20;
		System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
	}
}