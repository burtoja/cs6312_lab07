package edu.westga.cs6312.books.controller;

import edu.westga.cs6312.books.model.BookManager;
import edu.westga.cs6312.books.view.BookTUI;

/**
 * This will serve as the driver for the Book Manager Application
 * 
 * @author J. Allen Burton
 * @version Feb 24, 2020
 *
 */
public class BookDriver {

	/**
	 * This method is the entry point of the application
	 *
	 * @param args Command-line arguments, not used
	 */
	public static void main(String[] args) {
		BookManager currentBookManager = new BookManager();
		BookTUI userBookTUI = new BookTUI(currentBookManager);
		userBookTUI.run();
	}

}
