package studenci;

import java.io.Serializable;

public abstract class Student implements Serializable {
	private String name;
	private String index;
	
	public Student() {
		
	}
	
	public Student(String name, String index) {
		this.index = index;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIndex() {
		return this.index;
	}
	
	public void setIndex(String index) {
		this.index = index;
	}
	
	abstract int numOfStudents();
	
	@Override
	public String toString() {
		return(
				"Name: " + this.getName() +
				" Index: " + this.getIndex()
		);	
	}
}
