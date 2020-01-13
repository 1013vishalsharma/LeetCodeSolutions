package com.Solution;

public class Solution75 {

	public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length-1;
        
        while(m <= h){
        	if(nums[m] == 0){
        		swap(nums, m, l);
        		m++;
        		l++;
        	}
        	else if(nums[m] == 1){
        		m++;
        	}
        	else if(nums[m] == 2){
        		swap(nums, m, h);
        		h--;
        	}
        }
        
        for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
    }
	
	public void swap(int[] nums, int m, int l){
		int temp = nums[m];
		nums[m] = nums[l];
		nums[l] = temp;
	}
	
	public static void main(String[] args) {
		Solution75 sol = new Solution75();
		int[] nums = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sol.sortColors(nums);
	}

}
