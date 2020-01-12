package com.Solution;

public class Solution33 {

	public int search(int[] nums, int target) {
		int i = findPivot(nums, 0, nums.length-1, target);
		System.out.println(i);
		return 0;
    }
	
	public int findPivot(int[] nums, int low, int high, int target){
		if(low <= high){
			int mid = low + (high-low)/2;
			
			if(target >= nums[low]){
				return binarySearch(nums, low, mid, target);
			}
			else{
				return binarySearch(nums, mid+1, high, target);
			}
		}
		else{
			return -1;
		}
	}
	
	public int binarySearch(int[] nums, int low, int high, int target){
		if(high >= low){
			int mid = low + (high-low)/2;
			
			if(target < nums[mid]){
				return binarySearch(nums, low, mid-1, target);
			}
			else if(target > nums[mid]){
				return binarySearch(nums, mid+1, high, target);
			}
			else{
				return mid;
			}
		}
		else{
			return -1;
		}
	}

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		int[] nums = {1,3};
		sol.search(nums, 3);
	}

}
