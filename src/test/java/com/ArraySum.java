package com;

public class ArraySum {
	public static void main(String[] args) {

		int sum = 0;
		int c[] = { 2, 5, 8, 7, 4 };
		for (int i = 0; i < c.length; i++) {

			sum = sum + c[i];

		}
		System.out.println(sum);
	}
}
