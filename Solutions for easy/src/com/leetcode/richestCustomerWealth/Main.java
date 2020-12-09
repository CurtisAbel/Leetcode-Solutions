package com.leetcode.richestCustomerWealth;

public class Main {
	public static void main(String[] args) {
		
		int [][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
		
		System.out.println(maximumWealth(accounts));
		
	}
	
    public static int maximumWealth(int[][] accounts) {
    	int wealthiest =0;
    	int sum;
    	for(int row = 0; row<accounts.length; row++) {
    		sum=0;
    		for(int col =0; col<accounts[row].length; col++) {
    				sum+= accounts[row][col];
    		}
    		if(sum > wealthiest) {
				
				wealthiest=sum;
				
				
				
			}
			
    	}
    	
        return wealthiest;
    }

}
