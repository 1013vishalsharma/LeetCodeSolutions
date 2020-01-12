package com.Solution;

public class Solution35 {

	public int searchInsert(int[] nums, int target) {
        
		int res = 0; boolean found = false;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == target){
				res = i;
				found = true;
				break;
			}
			else if(nums[i] > target){
				res = i;
				found = true;
				break;
			}
			else{
				continue;
			}
		}
		if(!found){
			if(target < nums[0]){
				res = 0;
			}
			else{
				res = nums.length;
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int[] nums= {1,3,5,6};
		int target = 3;
		System.out.println(sol.searchInsert(nums, target));
	}

}
