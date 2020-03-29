package studenci;

public class StudentZaoczny extends Student {
	
	static int noOfObjects = 0;

	public StudentZaoczny(int index) {
		super(index);
		noOfObjects++;
	}

}
