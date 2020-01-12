package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<Integer> li = new ArrayList<Integer>();
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		comSum(candidates, target, li, 0, al);
		System.out.println();
		return al;
	}

	public void comSum(int[] candidates, int target, List<Integer> li, int i, List<List<Integer>> al) {

		if (i < candidates.length) {
			int ans = target - candidates[i];
			if (ans > 0) {
				li.add(candidates[i]);
				comSum(candidates, ans, li, i, al);
				li.remove(li.size()-1);
			} else if (ans < 0) {
				return;
			} else if (ans == 0) {
				li.add(candidates[i]);
				for (Iterator iterator = li.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					System.out.print(integer + " ");
				}
				System.out.println();
				
				al.add(new ArrayList<>(li));
				li.remove(li.size()-1);
				return;
			}
			i++;
			comSum(candidates, target, li, i, al);
		}
	}

	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		int can[] = { 2,3,5};
		sol.combinationSum(can, 8);
	}

}
