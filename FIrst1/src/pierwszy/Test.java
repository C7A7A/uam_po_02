package pierwszy;

import pierwszy.Fraction;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String runAgain;
		
		do {
			int numerator = scanner.nextInt();
			scanner.nextLine();
			int denominator = scanner.nextInt();
			scanner.nextLine();
			Fraction x = new Fraction(numerator, denominator);
			
			String operation = scanner.nextLine();
			
			numerator = scanner.nextInt();
			scanner.nextLine();
			denominator = scanner.nextInt();
			scanner.nextLine();
			Fraction y = new Fraction(numerator, denominator);
			
			Fraction result;
			
			switch(operation) {
				case "+":
					result = x.add(y);
					break;
				case "-":
					result = x.substract(y);
					break;
				case "*":
					result = x.multiply(y);
					break;
				case "/":
					result = x.divide(y);
					break;
				default:
					System.out.println("B��dny operator");
					result = new Fraction(0, 0);
			}
			System.out.println("Wynik: " + result);
			
			System.out.println("Chcesz wykona� kolejne dzia�anie? Wpisz liter� T lub N");
			runAgain = scanner.nextLine();
		} while(runAgain.equals("T"));
		
		scanner.close();
	}
}
