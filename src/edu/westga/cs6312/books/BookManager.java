package edu.westga.cs6312.books;

import java.util.ArrayList;

/**
 * This class will manage the pages read data for the book manager application
 * 
 * @author J. Allen Burton
 * @version Feb 20, 2020
 *
 */
public class BookManager {
	ArrayList<Integer> dailyPagesRead;
	String monthName;

	/**
	 * Constructor for BookMAnager objects
	 *
	 * @precondition none
	 *
	 * @postcondition new BookManager object created with variables initialized (no
	 *                values)
	 */
	public BookManager() {
		this.dailyPagesRead = new ArrayList<Integer>();
		this.monthName = "";
	}

	/**
	 * Sets the month in which pages were read
	 * 
	 * @param monthName the month pages were read
	 *
	 * @precondition monthName != null && monthName must be at least 2 characters
	 *               long
	 *
	 * @postcondition this.month will be set to value of monthName
	 */
	public void setMonth(String monthName) {
		if (monthName == null) {
			throw new IllegalArgumentException("Invalid entry.  Month cannot be null.");
		}
		if (monthName.length() < 2) {
			throw new IllegalArgumentException("Invalid entry.  Month must have at least two characters.");
		}
		this.monthName = monthName;
	}

	/**
	 * Adds a number of pages read entry to this object
	 * 
	 * @param numberOfPagesRead number of pages read to be added
	 *
	 * @precondition numberOfPagesRead >= 0
	 *
	 * @postcondition an entry is added to the dailyPagesRead ArrayList
	 */
	public void addPages(int numberOfPagesRead) {
		if (numberOfPagesRead < 0) {
			throw new IllegalArgumentException(
					"Invalid entry.  The number of pages read must me greater than or equal to zero.");
		}
		this.dailyPagesRead.add(numberOfPagesRead);
	}
	
	@Override
	public String toString() {
		String report = this.monthName + "\n";
		if (this.dailyPagesRead.size() == 0) {
			report += "no pages";
		} else {
			report += this.dailyPagesRead;
		}
		return report;
	}
}
