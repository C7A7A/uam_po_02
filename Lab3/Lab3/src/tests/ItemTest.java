package tests;

import org.junit.Test;
import shop.Item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ItemTest {
	
	@Test
	public void twoItemsWithTheSamePriceAndNameShouldBeEqual() {
		assertEquals(new Item("item", 123.12), new Item("item", 123.12));
	}
	
	@Test
	public void itemsWithDifferentNamesArentEqual() {
		assertNotEquals(new Item("item1", 123.12), new Item("item2", 123.12));
	}
	
	@Test
	public void itemsWithDifferentPricesArentEqual() throws Exception{
		assertNotEquals(new Item("item", 123.12), new Item("item", 123.13));
	}
	
	@Test
	public void itemsWithTheSameNameShouldHaveTheSameHashCode() {
		assertEquals(new Item("item", 123).hashCode(), new Item("item", 321).hashCode());
	}
	
	@Test
	public void itemsWithDifferentNameShouldHaveDifferentHashCode() {
		assertNotEquals(new Item("item1", 123).hashCode(), new Item("item2", 123).hashCode());
	}
	
	@Test
	public void itemsWithDifferentPriceAndTheSameNameShouldBeOrdered() {
		assertEquals(-1, new Item("item1", 0.1).compareTo(new Item("item1", 0.2)));
	}
}
