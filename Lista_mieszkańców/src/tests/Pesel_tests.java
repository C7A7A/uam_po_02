package tests;

import residents.Person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pesel_tests {
	private Person person;
	
	@Before
	public void setUp() {
		person = new Person();
	}
	
	@Test
	public void peselMustBe11Digets() {
		assertEquals(true, person.validate_pesel("81010200141"));
		assertEquals(false, person.validate_pesel(""));
	}
	
	@Test
	public void peselMustHasValidChecksum() {
		assertEquals(true, person.validate_pesel("81010200141"));
		assertEquals(false, person.validate_pesel("00000000001"));
	}
}
