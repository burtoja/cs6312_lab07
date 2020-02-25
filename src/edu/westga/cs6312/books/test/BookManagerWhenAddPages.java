package edu.westga.cs6312.books.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.books.model.BookManager;

/**
 * Test the addPages method of the BookManager class
 * 
 * @author J. Allen Burton
 * @version Feb 23, 2020
 *
 */
public class BookManagerWhenAddPages {

	/**
	 * Test the addPages method by adding single page entry (234) to a newly created
	 * BookManager object with no month set. 
	 * EXPECT: 's page totals are:\n\t234\n
	 */
	@Test
	public void testAddPagesExpect234NoMonth() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(234);
		String report = theBookManager.toString();
		assertEquals("'s page totals are:\n\t234\n", report);
	}

	/**
	 * Test the addPages method by adding multiple page entries (234, 541, 8, 12) to
	 * a newly created BookManager object with no month set. 
	 * EXPECT: 's page totals are:\n\t234\n\t541\n\t8\n\t12\n
	 */
	@Test
	public void testAddPagesExpect234541812NoMonth() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(234);
		theBookManager.addPages(541);
		theBookManager.addPages(8);
		theBookManager.addPages(12);
		String report = theBookManager.toString();
		assertEquals("'s page totals are:\n\t234\n\t541\n\t8\n\t12\n", report);
	}
	
	/**
	 * Test the addPages method by adding multiple page entries (234, 541, 8, 12) and a month to
	 * a newly created BookManager object with no month set. 
	 * EXPECT: May's page totals are:\n\t234\n\t541\n\t8\n\t12\n
	 */
	@Test
	public void testAddPagesExpectMay234541812() {
		BookManager theBookManager = new BookManager();
		theBookManager.setMonth("May");
		theBookManager.addPages(234);
		theBookManager.addPages(541);
		theBookManager.addPages(8);
		theBookManager.addPages(12);
		String report = theBookManager.toString();
		assertEquals("May's page totals are:\n\t234\n\t541\n\t8\n\t12\n", report);
	}
	
	/**
	 * Test the addPages method by adding single page entry of zero pages to a newly created
	 * BookManager object with no month set. 
	 * EXPECT: 's page totals are:\n\t0\n
	 */
	@Test
	public void testAddPagesExpectNoMonthNoPages() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(0);
		String report = theBookManager.toString();
		assertEquals("'s page totals are:\n\t0\n", report);
	}

}
