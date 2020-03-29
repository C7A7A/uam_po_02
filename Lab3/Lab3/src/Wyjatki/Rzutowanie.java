package Wyjatki;

public class Rzutowanie {

	
	public static void main(String[] args) {
		
       Wyjatek a = new Wyjatek();
       WyjatekDwa b = new WyjatekDwa(); 
       Throwable e = (Wyjatek) a;

       if (a instanceof Wyjatek) System.out.println("a jest instanceof Wyjatek");
       if (b instanceof WyjatekDwa) System.out.println("b jest instanceof WyjatekDwa");
       if (a instanceof WyjatekDwa) System.out.println("a jest instanceof WyjatekDwa");
       if (b instanceof Wyjatek) System.out.println("b jest instanceof Wyjatek");
       if (a instanceof Exception) System.out.println("a jest instanceof Exception");
       if (b instanceof Exception) System.out.println("b jest instanceof Exception");
     
       if (Wyjatek.class.isInstance(a)) System.out.println("a jest isInstance Wyjatek");
       if (WyjatekDwa.class.isInstance(b)) System.out.println("b jest isInstance WyjatekDwa");
       if (Wyjatek.class.isInstance(b)) System.out.println("b jest isInstance WyjatekDwa");
       if (WyjatekDwa.class.isInstance(a)) System.out.println("a jest isInstance Wyjatek");
       if (Exception.class.isInstance(a)) System.out.println("a jest isInstance Exception");
       if (Exception.class.isInstance(b)) System.out.println("b jest isInstance Exception");
       
       if (Wyjatek.class.equals(a.getClass())) System.out.println("a.Class jest == Wyjatek.class");
       if (WyjatekDwa.class.equals(b.getClass())) System.out.println("b.Class jest == WyjatekDwa.class");
       if (Wyjatek.class.equals(b.getClass())) System.out.println("b.Class jest == Wyjatek.class");
       if (WyjatekDwa.class.equals(a.getClass())) System.out.println("a.Class jest == WyjatekDwa.class");
       if (Throwable.class.equals(a.getClass())) System.out.println("a.Class jest == Exception.class");
       if (Exception.class.equals(b.getClass())) System.out.println("b.Class jest == Exception.class");
       
	}

}
