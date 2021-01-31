package com.leetcode.palindromenumber;

public class Main {
	public static void main(String[] args) {
		isPalindrome(121);

	}

	public static boolean isPalindrome(int x) {

		String value = Integer.toString(x);
		String reversed = "";

		for (int i = value.length() - 1; i >= 0; i--) {

			reversed = reversed + value.charAt(i);

		}

		if (reversed.equals(value)) {
			return true;

		} else {
			System.out.println(false);
			return false;
		}

	}

}
