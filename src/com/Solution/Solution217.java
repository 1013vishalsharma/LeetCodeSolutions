package com.Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution217 {

	public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean dup = false;
        for (int i = 0; i < nums.length; i++) {
        	if(!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        	}
        	else{
        		dup = true;
        	}
		}
        return dup;
    }
	
	public static void main(String[] args) {
		Solution217 sol = new Solution217();
		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(sol.containsDuplicate(nums));
	}

}
