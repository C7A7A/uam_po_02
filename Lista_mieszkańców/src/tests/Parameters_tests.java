package tests;

import residents.Person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Parameters_tests {
	private Person person;
	
	@Before
	public void setUp() {
		person = new Person();
	}
	
	@Test
	public void paramsOnInitShouldBeEqualToNieznane() {
		assertEquals("nieznane", person.getName());
		assertEquals("nieznane", person.getSurname());
		assertEquals("nieznane", person.getCity());
		assertEquals("nieznane", person.getPesel());
	}
	
	@Test
	public void paramsMustBeDiffrentFromNieznaneToAddResidentToList() {
		assertEquals(false, person.validate_parameter(person.getName()));
		assertEquals(false, person.validate_parameter(person.getSurname()));
		assertEquals(false, person.validate_parameter(person.getCity()));
		assertEquals(false, person.validate_parameter(person.getPesel()));
	}
	
	@Test
	public void paramsMustNotBeEmptyToAddResidentToList() {
		person.setName("");
		person.setSurname("");
		person.setCity("");
		person.setPesel("");
		
		assertEquals(false, person.validate_parameter(person.getName()));
		assertEquals(false, person.validate_parameter(person.getSurname()));
		assertEquals(false, person.validate_parameter(person.getCity()));
		assertEquals(false, person.validate_parameter(person.getPesel()));
	}
}
