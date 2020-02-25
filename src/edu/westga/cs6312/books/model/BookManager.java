package edu.westga.cs6312.books.model;

import java.util.ArrayList;

/**
 * This class will manage the pages read data for the book manager application
 * 
 * @author J. Allen Burton
 * @version Feb 20, 2020
 *
 */
public class BookManager {
	private ArrayList<Integer> dailyPagesRead;
	private String monthName;

	/**
	 * Constructor for BookManager objects
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
			throw new NullPointerException("Month cannot be null.");
		}
		if (monthName.length() < 2) {
			throw new IllegalArgumentException("Month name must have at least two characters.");
		}
		this.monthName = monthName;
	}

	/**
	 * Adds a number of pages read entry to this object
	 * 
	 * @param numberOfPagesRead number of pages read to be added
	 *
	 * @precondition numberOfPagesRead >= 0 and less than 2147483648 (seems like
	 *               reasonable bounds for pages read in a sitting)
	 *
	 * @postcondition an entry is added to the dailyPagesRead ArrayList
	 */
	public void addPages(int numberOfPagesRead) {
		if (numberOfPagesRead < 0) {
			throw new IllegalArgumentException("The number of pages read must be a non-negative integer.");
		}
		this.dailyPagesRead.add(numberOfPagesRead);
	}

	@Override
	public String toString() {
		String report = this.monthName + "'s page totals are:\n";
		if (this.dailyPagesRead.size() == 0) {
			report += "\tno pages";
		} else {
			for (int current : this.dailyPagesRead) {
				report += "\t" + current + "\n";
			}
		}
		return report;
	}
}
