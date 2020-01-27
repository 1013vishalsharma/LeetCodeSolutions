package com.Solution;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class Solution18 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
        //int i=0, j=nums.length-1;
		Set<Integer> set = new HashSet<>();
		
        for(int i=0; i<nums.length; i++) {
        	int sum = target - nums[i];
        	if(!set.contains(sum)) {
        		set.add(nums[i]);
        	}
        	else {
        		System.out.println(nums[i] + ", " + sum);
        	}
        }
		return null;
    }
	
	public List<List<Integer>> twoSum(int[] nums, int target) {
        //int i=0, j=nums.length-1;
		Set<Integer> set = new HashSet<>();
		
        for(int i=0; i<nums.length; i++) {
        	
        	int sum = -(nums[i] + nums[i+1]);
        	if(!set.contains(sum)) {
        		set.add(nums[i]);
        	}
        	else {
        		System.out.println(nums[i] + ", " + sum);
        	}
        }
		return null;
    }
	
	public List<List<Integer>> threeSum(int[] nums, int target) {
		Set<Integer> set = new HashSet<>();
		
		//1, 0, -1, 0, -2, 2
        for(int i=0; i<nums.length-2; i++) {
        	int sum = -(nums[i] + nums[i+1] + nums[i+2]);
        	//int sum = target - nums[i];
        	if(!set.contains(sum)) {
        		set.add(nums[i]);
        	}
        	else {
        		System.out.println(nums[i] + ", " + nums[i+1] + ", " + nums[i+2] + ", " + sum);
        	}
        }
		return null;
    }
	
	
	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		int[] nums = {1, 0, -1, 0, -2, 2};
		//int[] nums = {2,7,11,15};
		//sol.fourSum(nums, 93);
		//sol.twoSum(nums, 9);
		System.out.println();
		sol.threeSum(nums, 0);
	}

}
