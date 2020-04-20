package com;

public class IndexFromArray {

	public static void main(String[] args) {

		int c[] = { 2, 5, 8, 7, 4, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 7) {
				System.out.println(i);
				break;
			}
		}

	}

}
