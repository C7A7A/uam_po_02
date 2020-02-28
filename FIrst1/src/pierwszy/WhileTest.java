package pierwszy;

public class WhileTest {

	public static void main(String[] args) {
		double r = 0;
		while (r < 0.99d) {
			r = Math.random();
			// Poszukaj w dokumenntacji co jeszcze można wykonać przy pomocy
			// klasy Math
			// W jaki sposób wypisać najbliższą liczbę całkowitą do tej
			// wylosowanej ??
			// Wypisz tę wartość.
			System.out.println(r);
		}
	}
} 
