package com.Solution;

import java.util.Arrays;

public class Solution60 {

	static boolean found = false;
	static int c = 1;
	static String res = "";

	public String getPermutation(int n, int k) {
		int nums[] = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}

		int count[] = new int[n];
		Arrays.fill(count, 1);

		int result[] = new int[n];

		int level = 0;
		found = false;
		c =1;
		res="";
		res = permuteUtil(nums, count, result, level, k);
		System.out.println(res + " 888 ");
		return res;
	}

	public static String permuteUtil(int[] nums, int[] count, int[] result, int level, int k) {
		if (!found) {
			if (level == nums.length) {
				if (c < k) {
					c++;
				} else {
					res = displayPerm(result);
					found = true;
					return res;
				}
			}

			for (int i = 0; i < nums.length; i++) {
				if (count[i] == 0) {
					continue;
				}
				result[level] = nums[i];
				count[i]--;
				permuteUtil(nums, count, result, level + 1, k);
				count[i]++;
			}
		}
		return res;
	}

	public static String displayPerm(int[] result) {
		String res = "";
		for (int i = 0; i < result.length; i++) {
			res += result[i];
		}
		return res;
	}

	public static void main(String[] args) {

		Solution60 sol = new Solution60();
		int n = 4, k = 9;
		sol.getPermutation(n, k);

	}

}
