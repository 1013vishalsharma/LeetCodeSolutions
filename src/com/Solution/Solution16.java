package com.Solution;

import java.util.Arrays;

public class Solution16 {

	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i=0; i<nums.length; i++){
        	int j = i+1;
        	int k = nums.length-1;
        	
        	while(j < k){
        		int sum = nums[i] + nums[j] + nums[k];
        		int diff = Math.abs(target - sum);
        		if(diff == 0){
        			return sum;
        		}
        		else{
        			if(diff < min){
        				min = diff;
        				result = sum;
        			}
        		}
        		if(sum > target){
        			k--;
        		}
        		else{
        			j++;
        		}
        	}
        }
		return result;
    }
	
	public static void main(String[] args) {
		Solution16 sol = new Solution16();
		int[] nums = {-1, 2, 1, -4};
		sol.threeSumClosest(nums, 1);
	}

}
