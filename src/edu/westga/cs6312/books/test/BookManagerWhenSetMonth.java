package edu.westga.cs6312.books.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.books.model.BookManager;

/**
 * Test the set month method in the BookManager class
 * 
 * @author J. Allen Burton
 * @version Feb 23, 2020
 *
 */
public class BookManagerWhenSetMonth {

	/**
	 * Test the setMonth method by creating new BookManager object and then setting
	 * the month to "June" 
	 * EXPECT: June's page totals are:\n\tno pages
	 */
	@Test
	public void testSetMonthJuneExpectJuneNoPages() {
		BookManager theBookManager = new BookManager();
		theBookManager.setMonth("June");
		String report = theBookManager.toString();
		assertEquals("June's page totals are:\n\tno pages", report);
	}
	
	/**
	 * Test the setMonth method by creating new BookManager object and then setting
	 * the month to a two character string "Ap" 
	 * EXPECT: Ap's page totals are:\n\tno pages
	 */
	@Test
	public void testSetMonthApExpectApNoPages() {
		BookManager theBookManager = new BookManager();
		theBookManager.setMonth("Ap");
		String report = theBookManager.toString();
		assertEquals("Ap's page totals are:\n\tno pages", report);
	}
	
	/**
	 * Test the setMonth method by creating new BookManager object and then setting
	 * the month to a character string with a space in it "The Space" 
	 * EXPECT: The Space's page totals are:\n\tno pages
	 */
	@Test
	public void testSetMonthWithSpaceExpectTheSpaceWithSpaceNoPages() {
		BookManager theBookManager = new BookManager();
		theBookManager.setMonth("The Space");
		String report = theBookManager.toString();
		assertEquals("The Space's page totals are:\n\tno pages", report);
	}

}
