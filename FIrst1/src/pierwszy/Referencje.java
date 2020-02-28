package pierwszy;

public class Referencje {
	
	
	public static void main(String[] args) {
		Klasa obiekt1 = new Klasa(0);
		Klasa obiekt2 = new Klasa(1);
		
		System.out.println("1) obiekt1.b="+obiekt1.getB());
		System.out.println("1) obiekt2.b="+obiekt2.getB());

		Klasa.metoda(obiekt1);
		obiekt2 = Klasa.metoda(obiekt2);
		System.out.println("2) obiekt1.b="+obiekt1.getB());
		System.out.println("2) obiekt2.b="+obiekt2.getB());
		
		Klasa.metoda2(obiekt1);
		obiekt2 = Klasa.metoda2(obiekt2);
		//Przekazywanie przez referencje w wypadku JAVY oznacza, 
		//,¿e mo¿emy modyfikowaæ dany obiekt wewn¹trz metody nie 
		// mo¿emy jednak zmieniæ tego na jaki obiekt dana znienna wskazuje!
		System.out.println("3) obiekt1.b="+obiekt1.getB());
		System.out.println("3) obiekt2.b="+obiekt2.getB());

		int i=3;
		Klasa.metoda3(i);
		System.out.println("i="+i);
	}

} 
