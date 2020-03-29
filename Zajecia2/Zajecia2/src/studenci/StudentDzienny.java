package studenci;

public class StudentDzienny extends Student {
	
	static int noOfObjects = 0;
	
	public StudentDzienny(int index) {
		super(index);
		noOfObjects++;
	}
}
