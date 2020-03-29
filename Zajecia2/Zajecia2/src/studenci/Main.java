package studenci;

public class Main {

	public static void main(String[] args) {
		StudentDzienny jeden = new StudentDzienny(1);
		StudentDzienny dwa = new StudentDzienny(2);
		StudentDzienny trzy = new StudentDzienny(3);
		StudentDzienny cztery = new StudentDzienny(4);
		StudentDzienny piec = new StudentDzienny(5);
		
		StudentZaoczny z_jeden = new StudentZaoczny(01);
		StudentZaoczny z_dwa = new StudentZaoczny(02);
		StudentZaoczny z_trzy = new StudentZaoczny(03);
		StudentZaoczny z_cztery = new StudentZaoczny(04);
		StudentZaoczny z_piec = new StudentZaoczny(05);
		
		System.out.println(StudentDzienny.noOfObjects);
		System.out.println(StudentZaoczny.noOfObjects);

	}

}
