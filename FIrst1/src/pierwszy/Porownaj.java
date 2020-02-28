package pierwszy;

public class Porownaj {

	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = i1;
		System.out.println("i1==i2 " + (i1 == i2));
		System.out.println("i1==i3 " + (i1 == i3));
		System.out.println("i1 equals i2 " + (i1.equals(i2)));
	}

}