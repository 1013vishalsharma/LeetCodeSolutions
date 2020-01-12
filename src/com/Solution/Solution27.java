package com.Solution;

public class Solution27 {

	public int removeElement(int[] nums, int val) {
		int len=0, j=nums.length-1, i=0;
		
		while(i <= j){
			if(nums[i] != val){
				i++;
			}
			else{
				if(nums[i] == nums[j]){
					j--;
					len++;
				}
				else{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					j--;
					len++;
				}
			}
		}
		return nums.length-len;
    }
	
	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[] nums = {1};
		//int[] nums = {0,1,2,2,3,0,4,2};
		sol.removeElement(nums, 1);
	}

}
