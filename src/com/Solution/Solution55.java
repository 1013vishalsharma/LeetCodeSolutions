package com.Solution;

public class Solution55 {
	
	public boolean canJump(int[] nums) {
        
		if(nums.length == 0){
			return false;
		}
		
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if(max < i){
				return false;
			}
			
			max = Math.max(max, i+nums[i]);
		}
		return true;
    }

	public static void main(String[] args) {
		Solution55 sol = new Solution55();
		int[] nums = {2,3,1,1,4};
		//int nums[] = {3,2,1,0,4};
		
		System.out.println(sol.canJump(nums));
	}

}
