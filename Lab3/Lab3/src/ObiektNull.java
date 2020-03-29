
public class ObiektNull {

	public static String zmienna1;
	public static int zmienna2;
	
	public static void main(String[] args) {
		System.out.println(zmienna1);
		System.out.println(zmienna2);
		
		if (zmienna1 == null) {
			System.out.println("Zmienna jest nullem");
		} else {
			System.out.println("Zmienna nie jest nullem");
		}
		
//		zmienna1.concat("XD");
	}

}
