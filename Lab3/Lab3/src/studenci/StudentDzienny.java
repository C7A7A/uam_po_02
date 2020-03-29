package studenci;

public class StudentDzienny extends Student {
	
	public static int numOfObjects = 0;

	public StudentDzienny() {
		
	}
	
	public StudentDzienny(String name, String index) {
		super(name, index);
		numOfObjects++;
	}
	
	public int numOfStudents() {
		return StudentDzienny.numOfObjects;
	}

}
