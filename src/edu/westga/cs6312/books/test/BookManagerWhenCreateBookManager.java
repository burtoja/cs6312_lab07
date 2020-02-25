package edu.westga.cs6312.books.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.books.model.BookManager;

/**
 * This will serve to test the constructor and toString method in the
 * BookManager class
 * 
 * @author J. Allen Burton
 * @version Feb 20, 2020
 */
public class BookManagerWhenCreateBookManager {

	/**
	 * Test the creation of a BookManager method and the toString method when both
	 * dailyPagesRead and monthName are initialized but empty. Expect a blank string
	 * followed on the next line by "'s page totals are:\n\tno pages" indicating
	 * that no pages have been added to the ArrayList yet.
	 */
	@Test
	public void testBookManagerWhenCreateBookManager() {
		BookManager theBookManager = new BookManager();
		String report = theBookManager.toString();
		assertEquals("'s page totals are:\n\tno pages", report);
	}

}
