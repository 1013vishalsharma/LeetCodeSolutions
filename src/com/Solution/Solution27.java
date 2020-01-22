package com.Solution;

public class Solution27 {

	public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = 1;
		for(int i=0; i< nums.length; i++) {
        	if(nums[i] == val) {
        		while(nums[j] == val) {
        			j++;
        		}
        		nums[i] = nums[j];
        	}
        	else {
        		j++;
        	}
        }
		return count;
    }
	
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[] nums = {3,2,2,3};
		sol.removeElement(nums, 3);
	}

}
