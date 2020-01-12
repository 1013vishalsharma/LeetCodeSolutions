package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution46 {
	
	List<List<Integer>> li = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {

		int[] count = new int[nums.length];
		Arrays.fill(count, 1);
		int[] result = new int[nums.length];
		int level = 0;
		permute(nums, result, count, level);
		return li;

	}

	public void permute(int arr[], int[] result, int[] count, int level) {
		if (level == arr.length) {
			displayArr(result);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (count[i] == 0) {
				continue;
			} else {
				result[level] = arr[i];
				count[i]--;
				permute(arr, result, count, level + 1);
				count[i]++;
			}
		}
	}

	public void displayArr(int[] result) {
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			al.add(result[i]);
		}
		System.out.println();
		li.add(al);
	}

	public static void main(String[] args) {

		Solution46 sol = new Solution46();
		int[] arr = { 1, 2, 3 };
		sol.permute(arr);
		int[] count = new int[arr.length];
		Arrays.fill(count, 1);
		// String result = "";
		int[] result = new int[arr.length];
		int level = 0;
		sol.permute(arr, result, count, level);
	}

}
