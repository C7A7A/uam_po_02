package tests;

import residents.Program;
import residents.Person;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Resident_list_tests {
	private Person person;
	private ArrayList<Person> residents = new ArrayList<Person>();
	
	@Before
	public void setUp() {
		person = new Person("Mateusz", "Czajka", "Poznañ", "99070902457");
	}
	
	@Test
	public void shouldBeAbleToAddNewResidentToList() {
		Program.add_resident(residents, person);
		Person resident = get_resident(person.getPesel());
		assertEquals(person, resident);
	}
	
	@Test
	public void shouldOverrideIfTheSamePesel() {
		Program.add_resident(residents, person);
		Program.add_resident(residents, new Person("Andrzej", "Nowak", "Kraków", "99070902457"));
		assertEquals(1, residents.size());
	}
	
	public Person get_resident(String pesel) {
		Person resident = new Person();
		
		for(Person person : residents) {
			if (person.getPesel().equals(pesel)) {
				resident = person;
				break;
			}
		}
		
		return resident;
	}
}
