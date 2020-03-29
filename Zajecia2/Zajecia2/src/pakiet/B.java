package pakiet;

public class B extends A {
	public String pole = "jestem obiektem w klasie B";
	
	public void check() {
		this.a = 15;
		this.b = 25;
//		this.c = 35;
		this.d = 45;
	}
	
	@Override
	public void wypisz() {
		System.out.println("Metoda klasy B");
	}
}
