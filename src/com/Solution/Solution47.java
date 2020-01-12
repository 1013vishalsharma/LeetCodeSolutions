package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution47 {

	public List<List<Integer>> permuteUnique(int[] nums) {
        int[] result = new int[nums.length];
        int[] count = new int[nums.length];
        Arrays.fill(count, 1);
        int level = 0;
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        permuteUtil(nums, result, count, level, al);
		System.out.println();
        return al;
    }
	
	public void permuteUtil(int[] nums, int[] result, int[] count, int level, List<List<Integer>> al){
		if(level < nums.length){
			for(int i=0; i<nums.length; i++){
				if(count[i] == 0){
					continue;
				}
				result[level] = nums[i];
				count[i]--;
				permuteUtil(nums, result, count, level+1, al);
				count[i]++;
			}
		}
		else{
			List<Integer> li = new ArrayList<>();
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
				li.add(result[i]);
			}
			if(!al.contains(li)){
				al.add(li);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Solution47 sol = new Solution47();
		int[] nums = {1,1,2};
		sol.permuteUnique(nums);
	}

}
