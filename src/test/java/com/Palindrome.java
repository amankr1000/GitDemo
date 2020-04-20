package com;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);

		}
		System.out.println(t);

		if (s.equals(t)) {
			System.out.println("Its palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
