package com.pnc.models;

public class KidUsers implements LibraryUser {
	private int age;
	private String bookType;

	// constructor
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	// methods
	@Override
	public void registerAccount() {
		
		String message = "";
		if (this.age < 12) {
			message = "You have successfully registered under a Kids Account";
		} else {
			message = "Sorry, Age must be less than 12 to register as a kid";
		}

		System.out.println(message);

	}

	@Override
	public void requestBook() {
		
		String message = "";
		if (bookType.equals("Kids")) {
			message = "Book Issued successfully, please return the book within 10 days";
		} else {
			message = "Oops, you are allowed to take only kids books";
		}
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "KidUsers [age=" + age + ", bookType=" + bookType + "]";
	}

}// class
