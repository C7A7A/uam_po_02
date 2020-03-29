package Wyjatki;

class Watek{
	public void dwa(boolean czyWyjatek) throws Wyjatek{
		System.out.println("Metoda dwa wypisywanie 1");
		if(czyWyjatek) {
			throw new Wyjatek();
		}
		
		if(!czyWyjatek) {
			throw new WyjatekDwa();
		}
		
		System.out.println("Metoda dwa wypisywanie 2");
	}
	
	public void jeden(boolean czyWyjatek) throws Wyjatek{
		System.out.println("Metoda jeden wypisywanie 1");
		try {
			dwa(czyWyjatek);
		} catch (WyjatekDwa e) {
			System.out.println("wartoúÊ false (Klasa: WyjatekDwa)");
			e.printStackTrace();
		} catch (Wyjatek e) {
			System.out.println("wartoúÊ true (Klasa: Wyjatek)");
			throw e;
		} 
		System.out.println("Metoda jeden wypisywanie 2");
	}
}

public class Wyjatki {
	
	public static void main(String[] args) {
		System.out.println("Zaczynamy dzia≈Çanie programu");
		Watek w = new Watek();
		try {
			w.jeden(true);
		} catch (Wyjatek e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ko≈Ñczymy dzia≈Çanie programu");
		
//		try {
//			w.jeden(false);
//		} finally {
//			System.out.println("Blok finally");
//		}
	}

}
