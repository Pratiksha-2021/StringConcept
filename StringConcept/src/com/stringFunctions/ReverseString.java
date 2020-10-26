package com.stringFunctions;

public class ReverseString {
	public static void strreverse() {

		String str = "pratiksha";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse of string is.....>" + rev);
	}

	public static void main(String[] args) {
		ReverseString.strreverse();

	}
}
