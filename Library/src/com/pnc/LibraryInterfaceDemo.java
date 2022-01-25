package com.pnc;

import com.pnc.models.AdultUsers;
import com.pnc.models.KidUsers;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		//Test Case #1
		KidUsers kid1 = new KidUsers(10,"Kids");
		KidUsers kid2 = new KidUsers(18,"Fiction");
		
		System.out.println("Test Case 1, Kid 1");
		kid1.registerAccount();
		kid1.requestBook();
		System.out.println("\nTest Case 1, Kid 2");
		kid2.registerAccount();
		kid2.requestBook();
		
		//Test Case #2
		
		AdultUsers adult1 = new AdultUsers(5, "Kids");
		AdultUsers adult2 = new AdultUsers(23, "Fiction");
		
		System.out.println("\nTest Case 2 Adult 1");
		adult1.registerAccount();
		adult1.requestBook();
		
		System.out.println("\nTest Case 2 Adult 2");
		adult2.registerAccount();
		adult2.requestBook();

	}

}
