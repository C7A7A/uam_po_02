package kolekcje;


public class Command {
	String str;
	
	public Command(String str) {
		this.str = str;
	}
	
	public String operation() {
		return str;
	}
	
}
