package edu.westga.cs6312.books.view;

import java.util.Scanner;

import edu.westga.cs6312.books.model.BookManager;

/**
 * This class will serve as the TUI for the BookManager Application allowing
 * users to enter and view in pages read entries
 * 
 * @author J. Allen Burton
 * @version Feb 24, 2020
 *
 */
public class BookTUI {
	private BookManager userBookManager;
	private Scanner userInput;

	/**
	 * Constructor for BookTUI objects.
	 *
	 * @param userBookManager the BookManager object in use by the user
	 *
	 * @precondition userBookManager != null
	 *
	 * @postcondition a new BookTUI object is created with a BookManager object
	 *                provided in the parameter
	 */
	public BookTUI(BookManager userBookManager) {
		this.userBookManager = userBookManager;
		this.userInput = new Scanner(System.in);
	}

	/**
	 * This method serves as the director of the user interface
	 *
	 * @precondition none
	 *
	 * @postcondition changes to the object dictated by private methods within this
	 *                method
	 */
	public void run() {
		System.out.println("Welcome to the Book Manager Application.");
		this.getMonthFromUser();
		int userChoice;
		do {
			this.displayMenu();
			userChoice = this.getIntegerFromUser("Please enter your choice from the menu: ");
			switch (userChoice) {
				case 1:
					this.addPagesToCollection();
					break;
				case 2:
					this.printPageTotals();
					break;
				case 3:
					break;
				default:
					System.out.println("Invalid menu choice. Please choose from the following options:");
			}
		} while (userChoice != 3);
		System.out.println("Thank you for using the Book Manager Application.");
	}

	/**
	 * Prompts user to enter the month for the collection of pages read and stores
	 * the value (if valid) to the month name for this collection
	 * 
	 * @precondition user must input a minimum of two characters (any two will do)
	 *
	 * @postcondition the BookManager object month will be set to the users input
	 *                provided it is valid (>1 character)
	 */
	private void getMonthFromUser() {
		boolean isValid = false;
		do {
			try {
				System.out.println("Please enter the month name:");
				String monthName = this.userInput.nextLine();
				this.userBookManager.setMonth(monthName);
				isValid = true;
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage() + "\nPlease try again.\n");
			}
		} while (!isValid);
	}

	/**
	 * This method will display the menu of choices for the user
	 *
	 * @precondition none
	 *
	 * @postcondition displayed menu to console
	 */
	private void displayMenu() {
		System.out.println("\n\t-----------------------------------------");
		System.out.println("\t| 1 - Add a page total to the collection  |");
		System.out.println("\t| 2 - Print the list of page totals       |");
		System.out.println("\t| 3 - Quit                                |");
		System.out.println("\t-----------------------------------------");
	}

	/**
	 * This method displays the message provided in the parameter, reads the user
	 * input, and returns the integer provided by the user.
	 * 
	 * @return integer value provided by the user
	 *
	 * @precondition none
	 *
	 * @postcondition integer returned corresponding to user input
	 */
	private int getIntegerFromUser(String message) {
		String input = "";
		int userInteger = 0;
		boolean isValid = false;
		do {
			try {
				System.out.println(message);
				input = this.userInput.nextLine();
				userInteger = Integer.parseInt(input);
				isValid = true;
			} catch (NumberFormatException nfe) {
				System.out.println("Your entry (" + input + ") was not a valid integer.  Please try again.");
			}
		} while (!isValid);
		return userInteger;
	}

	/**
	 * This method will prompt the user to enter a page total to be added to the
	 * collection
	 * 
	 * @precondition none (user input must meet conditions established and checked
	 *               elsewhere)
	 *
	 * @postcondition BookManager object has additional entry of pages
	 */
	private void addPagesToCollection() {
		boolean isValid = false;
		do {
			try {
				int pageTotal = this.getIntegerFromUser("Please enter a daily page total: ");
				this.userBookManager.addPages(pageTotal);
				isValid = true;
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			}
		} while (!isValid);
	}

	/**
	 * This method will print the month and a list of page totals to the console
	 * 
	 * @precondition none
	 *
	 * @postcondition no change to object
	 */
	private void printPageTotals() {
		System.out.println(this.userBookManager.toString());
	}
}
