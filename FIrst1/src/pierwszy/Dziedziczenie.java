package pierwszy;

public class Dziedziczenie{
	
	public static void main(String arg[]){
		Nadklasa a = new Nadklasa();
		System.out.println("Jaki obiekt " + a);
		Podklasa b = new Podklasa();
		System.out.println("Jaki obiekt " +b);
		a=b;
		System.out.println("Jaki obiekt " +a);
	}
	
}

class Nadklasa{
	
	Nadklasa(){	
	}
	
}

class Podklasa extends Nadklasa{

	Podklasa(){	
	}
	
}