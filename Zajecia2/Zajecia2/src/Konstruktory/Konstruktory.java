package Konstruktory;

/**
 * @author matcza5
 * @see Insekt#nazwa
 */
class Insekt {
	 final int i = 9;
	 final int j;

	public Insekt(int x) {
		this.j = 0;
		System.out.println("Teraz wykonuje konstruktor Insekt!");
		System.out.println("i =" + i + " ,j=" + j);
	}

	private static int x1 = print("statyczna zmienna Insekta zainicjalizowana");

	public String nazwa() {
		return "Insecta";
	}

	static int print(String s) {
		System.out.println(s);
		return 47;
	}
}

class Pszczola extends Insekt {
	private int k = print("Zmienna Pszczoly zainicjalizowana");
	
	public Pszczola(int x) {
		super(x);
		System.out.println("Teraz wykonuje konstruktor Pszczoly!");
		System.out.println("k = " + k);
		System.out.println("j = " + j);
		k = 23;
		System.out.println("k = " + k);
	}

	public String nazwa() {
		return "Apis";
	}

	private static int x2 = print("statyczna zmienna Pszczoly zainicjalizowana");
}

public class Konstruktory {

	public static void main(String[] args) {
		System.out.println("Pszczola tworzymy obiekt");
		Pszczola b1 = new Pszczola(6);
		Pszczola b2 = new Pszczola(6);
		System.out.println(b1.nazwa());
	}

}
