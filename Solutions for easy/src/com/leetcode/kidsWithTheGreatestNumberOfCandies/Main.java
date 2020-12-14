package com.leetcode.kidsWithTheGreatestNumberOfCandies;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		int[] myArr = { 2, 3, 5, 1, 3 };

		kidsWithCandies(myArr, 3);

	} 

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> isHigherThanGreatestCandy = new ArrayList<>();
		int greatest = 0;

		// loop to find child with most candies within array
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > greatest) {

				greatest = candies[i];

			}
		}

		// checks if extra candies are higher than child with greatest candies
		for (int j = 0; j < candies.length; j++) {
			if (candies[j] + extraCandies >= greatest) {
				isHigherThanGreatestCandy.add(true);

			} else {

				isHigherThanGreatestCandy.add(false);
			}

		}

		System.out.println(isHigherThanGreatestCandy);
		return isHigherThanGreatestCandy;

	}

}
