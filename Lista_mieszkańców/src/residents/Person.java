package residents;


public class Person {
	private String city;
	private String name;
	private String surname;
	private String pesel;
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPesel()  {
		return this.pesel;
	}
	
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	public Person() {
		this.name = "nieznane";
		this.surname = "nieznane";
		this.city = "nieznane";
		this.pesel = "nieznane";
	}
	
	public Person(String name, String surname, String city, String pesel) {
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.pesel = pesel;
	}
	
	public boolean validate_parameter(String par) {
		if (par.equals("nieznane")) return false;
		if (par.isEmpty()) return false;
		return true;
	}
	
	public boolean validate_pesel(String pesel) {
		if (pesel.length() != 11) return false;
		if (!check_sum(pesel)) return false;
		return true;
	}
	
	private boolean check_sum(String pesel) {
		int control_sum = 9 * Character.getNumericValue(pesel.charAt(0)) + 7 * Character.getNumericValue(pesel.charAt(1))
						+ 3 * Character.getNumericValue(pesel.charAt(2)) + 1 * Character.getNumericValue(pesel.charAt(3))
						+ 9 * Character.getNumericValue(pesel.charAt(4)) + 7 * Character.getNumericValue(pesel.charAt(5))
						+ 3 * Character.getNumericValue(pesel.charAt(6)) + 1 * Character.getNumericValue(pesel.charAt(7))
						+ 9 * Character.getNumericValue(pesel.charAt(8)) + 7 * Character.getNumericValue(pesel.charAt(9));
 		if (Character.getNumericValue(pesel.charAt(10)) == (control_sum % 10)) return true;
 		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		
		Person person = (Person) obj;
		return (person.name.equals(this.name) && person.surname.equals(this.surname) && person.city.equals(this.city) && person.pesel.equals(this.pesel));
	}
}

