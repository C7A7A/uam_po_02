package pierwszy;

import pierwszy.Fraction;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String runAgain;
		int fractionInteger;
		int numerator;
		int denominator;
		
		do {
			System.out.println("Podaj czêœæ ca³kowit¹: ");
			fractionInteger = scanner.nextInt();
			System.out.println("Podaj mianownik: ");
			numerator = scanner.nextInt();
			System.out.println("Podaj licznik: ");
			denominator = scanner.nextInt();
			
			Fraction a = new Fraction(fractionInteger, numerator, denominator);
			
			System.out.println("Podaj czêœæ ca³kowit¹: ");
			fractionInteger = scanner.nextInt();
			System.out.println("Podaj mianownik: ");
			numerator = scanner.nextInt();
			System.out.println("Podaj licznik: ");
			denominator = scanner.nextInt();
			
			Fraction b = new Fraction(fractionInteger, numerator, denominator);
			
			Fraction c = new Fraction();
			
			System.out.println("Dodawanie: ");
			c = a.add(b);
			System.out.println(c.fractionInteger);
			System.out.println(c.numerator);
			System.out.println(c.denominator);
			
			System.out.println("Odejmowanie: ");
			c = a.substract(b);
			System.out.println(c.fractionInteger);
			System.out.println(c.numerator);
			System.out.println(c.denominator);
			
			System.out.println("Mno¿enie: ");
			c = a.multiply(b);
			System.out.println(c.fractionInteger);
			System.out.println(c.numerator);
			System.out.println(c.denominator);
			
			System.out.println("Dzielenie: ");
			c = a.divide(b);
			System.out.println(c.fractionInteger);
			System.out.println(c.numerator);
			System.out.println(c.denominator);
			
			System.out.println("T - dalej, N - stop");
			runAgain = scanner.next();
		} while(runAgain.equals("T"));
		
		scanner.close();
	}
}
