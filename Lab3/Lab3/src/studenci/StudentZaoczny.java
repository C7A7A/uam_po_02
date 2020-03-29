package studenci;

public class StudentZaoczny extends Student {
	
	public static int numOfObjects = 0;
	
	public StudentZaoczny() {
		
	}
	
	public StudentZaoczny(String name, String index) {
		super(name, index);
		numOfObjects++;
	}
	
	public int numOfStudents() {
		return StudentZaoczny.numOfObjects;
	}
}
