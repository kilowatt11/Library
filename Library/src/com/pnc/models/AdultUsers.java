package com.pnc.models;

public class AdultUsers implements LibraryUser {
	private int age;
	private String bookType;

	public AdultUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	// methods
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		String message = "";
		if (this.age > 12) {
			message = "You have successfully registered under an Adult Account";
		} else {
			message = "Sorry, Age must be greater than 12 to register as an adult";
		}
		System.out.println(message);
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		String message = "";
		if (this.bookType.equals("Fiction")) {
			message = "Book Issued successfully, please return the book within 7 days";
		} else {
			message = "Oops, you are allowed to take only adult Fiction books";
		}
		System.out.println(message);
	}

}// class
