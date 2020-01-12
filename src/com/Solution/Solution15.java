package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution15 {

	public List<List<Integer>> threeSum(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		List<List<Integer>> al = new ArrayList<>();
		Set<List<Integer>> cacheTriplets = new HashSet();
		Arrays.sort(nums);
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			set.clear();
			for (int j = i + 1; j < nums.length; j++) {
				c = -(nums[i] + nums[j]);
				if (set.contains(c)) {
					List<Integer> nl = new ArrayList<>();
					nl.add(nums[i]);
					nl.add(nums[j]);
					nl.add(c);
					//Collections.sort(nl);
					if (!cacheTriplets.contains(nl)) {
						al.add(nl);
						cacheTriplets.add(nl);
					}
				} else {
					set.add(nums[j]);
				}
			}
		}
		System.out.println(al);
		return al;
	}

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		//int[] nums = { -1, 0, 1, 2, -1, -4 };
		int[] nums = {1,2,-2,-1};
		sol.threeSum(nums);
	}

}
