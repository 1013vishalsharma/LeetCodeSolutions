package com.Solution;

import java.util.Arrays;

public class Solution31 {
	public void nextPermutation(int[] nums) {
        
		int min =0, max = 0, maxVal = Integer.MAX_VALUE;
		boolean found = false;
		for(int i=nums.length-1; i>0; i--){
			if(nums[i-1] < nums[i]){
				min = i-1;
				found = true;
				break;
			}
        }
		
		if(!found){
			Arrays.sort(nums);
			return;
		}
		
		for(int i=min+1; i<nums.length; i++){
			if(nums[i] > nums[min] && nums[i] < maxVal){
				max = i;
				maxVal = nums[i];
			}
		}
		swap(nums, min, max);
		Arrays.sort(nums, min+1, nums.length);
		
//		for(int i=0;i <nums.length; i++){
//			System.out.print(nums[i] + " ");
//		}
    }
	
	public void swap(int nums[], int min ,int max){
		int temp = nums[min];
		nums[min] = nums[max];
		nums[max] = temp;
	}
	
	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int[] nums = {2,1,8,7,6,5};
		sol.nextPermutation(nums);
	}

}
