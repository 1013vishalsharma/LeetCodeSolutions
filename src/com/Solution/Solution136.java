package com.Solution;

public class Solution136 {

	public int singleNumber(int[] nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
			sum = sum ^ nums[i];
		}
        System.out.println(Math.abs(sum));
		return 0;
    }
	
	public static void main(String[] args) {
		Solution136 sol = new Solution136();
		int nums[] = {4,1,2,1,2};
		sol.singleNumber(nums);
	}

}
