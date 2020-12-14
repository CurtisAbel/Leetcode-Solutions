package com.leetcode.shuffleTheArray;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	
	int [] nums = {2,5,1,3,4,7};
	
	shuffle(nums,3);
	
}

public static int[] shuffle(int[] nums, int n) {
	int x =0; int y =n;
	
	int [] myArr = new int[nums.length];
	
	for(int i =0; i<nums.length;i++) {
		if(i%2==0) {
			myArr[i]=nums[x];
			x++;
			
		}else {
			myArr[i]=nums[y];
			y++;
			
		}
		
	}
	//System.out.println(Arrays.toString(myArr));
	return myArr;
	
	
	
}


}
