package com.bridgelabz.userregistration;

public class CustomException {

	public static class InvalidFirstName extends RuntimeException{
		public InvalidFirstName(String msg) {
			super(msg);
		}
	}
}
