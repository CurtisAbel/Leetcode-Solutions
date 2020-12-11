package com.leetcode.runningsum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] myArr = { 1, 2, 3, 4 };
		runningSum(myArr);

	}

	public static int[] runningSum(int[] nums) {

		for (int i = 1; i < nums.length; i++) {

			nums[i] += nums[i - 1];

		}
	//	System.out.println(Arrays.toString(nums));
		return nums;
	}

}
