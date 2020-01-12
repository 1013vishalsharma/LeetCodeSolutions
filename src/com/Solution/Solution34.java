package com.Solution;

import java.util.ArrayList;

public class Solution34 {

	
	public int[] searchRange(int[] nums, int target) {
        int pivot = binarySearch(nums, 0, nums.length-1, target);        
        int min = pivot, max = pivot;
        
        int[] arr = new int[2];
        
        if(pivot == -1){
        	arr[0] = -1;
        	arr[1] = -1;
        	System.out.println(arr[0] + " " +arr[1]);
        	return arr;
        }
        
        boolean left = true, right = true;
        while(left || right){
        	if(min-1 >=0 && nums[min-1] == target){
        		min = min-1;
        	}
        	else{
        		left = false;
        	}
        	if(max+1 < nums.length && nums[max+1] == target){
        		max = max+1;
        	}
        	else{
        		right = false;
        	}
        }
        arr[0] = min;
        arr[1] = max;
        System.out.println(min + " " + max);
        return arr;
    }
	
	public int binarySearch(int nums[], int low, int high, int target){
		if(low <= high){
			int mid = (low+high)/2;
			
			if(target == nums[mid]){
				return mid;
			}
			else if(target < nums[mid]){
				return binarySearch(nums, low, mid-1, target);
			}
			else{
				return binarySearch(nums, mid+1, high, target);
			}
		}
		else{
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		int nums[] = {5,7,7,8,8,10};
		sol.searchRange(nums, 7);
	}

}
