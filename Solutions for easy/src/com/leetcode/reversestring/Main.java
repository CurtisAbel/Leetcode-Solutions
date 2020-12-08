package com.leetcode.reversestring;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		char [] s = {'H', 'e', 'l', 'l', 'o'};
		
		
		reverseString(s);
		
	}

public static void reverseString(char[] s) {
        char temp;
	
	
	for(int i =0, j = s.length-1; i<j;i++, j--) {
		temp = s[j];
		s[j]=s[i];
		s[i] = temp;
		
	}
	System.out.println(Arrays.toString(s));
    }
	
}
