package com.Solution;

public class Solution33 {

	public int search(int[] nums, int target) {
		System.out.println(binarySearch(nums, 0, nums.length-1, target));
		return 0;
    }
	
	public int binarySearch(int[] nums, int low, int high, int target) {
		int mid = 0;
		int ans = 0;
		if(low < high) {
			mid = (low + high)/2;
		}
		if(nums[mid] == target) {
			ans = mid;
		}
		else if(nums[mid] > target || nums[mid] < target) {
			binarySearch(nums, low, mid, target);
			binarySearch(nums, mid+1, high, target);
		}
		else {
			ans = -1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		int[] nums = {4,5,6,7,0,1,2};
		sol.search(nums, 0);
	}

}
