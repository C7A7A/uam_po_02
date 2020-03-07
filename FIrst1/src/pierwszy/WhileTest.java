package pierwszy;

public class WhileTest {

	public static void main(String[] args) {
		double r = 0, s = 0;
		while (r < 0.99d) {
			r = Math.random();
			s = Math.round(r);
			// Poszukaj w dokumenntacji co jeszcze można wykonać przy pomocy
			// klasy Math
			// W jaki sposób wypisać najbliższą liczbę całkowitą do tej
			// wylosowanej ??
			// Wypisz tę wartość.
			System.out.println("Rand: " + r);
			System.out.println("Round rand: " + s);
		}
	}
} 
