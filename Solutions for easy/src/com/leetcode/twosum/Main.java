package com.leetcode.twosum;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
	int [] nums = {2,7,11,15};
	twoSum(nums, 9);
		
		int [] nums2 = {3,2,4};
		twoSum(nums2, 6);
	}
public static int[] twoSum(int [] nums, int target) {
	int [] result = new int[2];
	for(int i =0; i<nums.length;i++) {
		for(int j = i+1; j<nums.length;j++) {
			if(nums[i] + nums[j] ==target) {
				result = new int[]{i,j};
				
			}
			
		}
	
	}
	return result;
	
	
}
	
	
}
