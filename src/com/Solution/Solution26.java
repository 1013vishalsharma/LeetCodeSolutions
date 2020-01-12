package com.Solution;

public class Solution26 {
	
	public int removeDuplicates(int[] nums) {
        int len = 0;
		for(int i=1; i<nums.length; i++){
			if(nums[i] > nums[i-1]){
				len++;
				nums[len] = nums[i]; 
			}
		}
		return len+1;
    }
	
	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		//int nums[] = {1,1,2};
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		sol.removeDuplicates(nums);
	}

}
