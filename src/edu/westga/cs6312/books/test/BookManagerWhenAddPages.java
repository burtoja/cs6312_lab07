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
	 * BookManager object with no month set. EXPECT: \n234\n
	 */
	@Test
	public void testAddPagesExpect234NoMonth() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(234);
		String report = theBookManager.toString();
		assertEquals("\n234\n", report);
	}

	/**
	 * Test the addPages method by adding multiple page entries (234, 541, 8, 12) to
	 * a newly created BookManager object with no month set. EXPECT: \n234\n54\n8\n12\n
	 */
	@Test
	public void testAddPagesExpect234541812NoMonth() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(234);
		theBookManager.addPages(541);
		theBookManager.addPages(8);
		theBookManager.addPages(12);
		String report = theBookManager.toString();
		assertEquals("\n234\n541\n8\n12\n", report);
	}
	
	/**
	 * Test the addPages method by adding multiple page entries (234, 541, 8, 12) and a month to
	 * a newly created BookManager object with no month set. EXPECT: May\n234\n54\n8\n12\n
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
		assertEquals("May\n234\n541\n8\n12\n", report);
	}
	
	/**
	 * Test the addPages method by adding single page entry of zero pages to a newly created
	 * BookManager object with no month set. EXPECT: \n0
	 */
	@Test
	public void testAddPagesExpectNoMonthNoPages() {
		BookManager theBookManager = new BookManager();
		theBookManager.addPages(0);
		String report = theBookManager.toString();
		assertEquals("\n0\n", report);
	}

}
