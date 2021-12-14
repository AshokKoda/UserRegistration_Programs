package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	// Validate first name
	public static void validFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);

		if (!matcher.find()) {
			System.out.println("First letter should be capital.");
		} else {
			System.out.println("Firstname is valid.");
		}
	}
	
	//Validate Last name
	public static void validLastName(String lastName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{3,}");
		Matcher matcher = pattern.matcher(lastName);

		if (!matcher.find()) {
			System.out.println("First letter should be capital.");
		} else {
			System.out.println("Lastname is valid.");
		}
	}

	public static void main(String[] args) {

		System.out.println("----------Welcome To User Registration------------");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Firstname: ");
		String fname = sc.next();
		System.out.println("Firstname is: " + fname);
		validFirstName(fname);
		
		System.out.println("Enter Lastname: ");
		String lname = sc.next();
		System.out.println("Lastname is: " + lname);
		validLastName(lname);
	}

}
