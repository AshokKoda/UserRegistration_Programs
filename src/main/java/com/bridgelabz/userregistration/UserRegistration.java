package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//Validate first name
	public static void validFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
		
		if(!matcher.find()) {
			System.out.println("Firstname should be capital.");
		}else {
			System.out.println("Firstname is valid.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Firstname: ");
		String fname = sc.next();
		System.out.println("Firstname is: " + fname);
		validFirstName(fname);

	}

}
