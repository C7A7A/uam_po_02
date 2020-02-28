package pierwszy;

public class Przypisz {

	public static void main(String[] args) {
		Klasa a = new Klasa(0);
		Klasa b = new Klasa(1);
		System.out.println(a.getB());
		System.out.println(b.getB());
		a = b;
		System.out.println(a.getB());
		System.out.println(b.getB());
	    Klasa.metoda(b);
		System.out.println(a.getB());
		System.out.println(b.getB());
	}
}