package com.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution78 {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		List<Integer> li = new ArrayList<>();

		al = subsets(nums, al, li, 1, 0);
		return al;
	}

	public List<List<Integer>> subsets(int[] n, List<List<Integer>> al, List<Integer> li, int k, int s) {		
		if(s == n.length){
			al.add(new ArrayList<>(li));
				for (Iterator iterator = li.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					System.out.print(integer + " ");
				}
				System.out.println();
			return al;
		}
			li.add(n[s]);
			subsets(n, al, li, k, s+1);
			li.remove(li.size()-1);
			subsets(n, al, li, k, s+1);
		return al;
	}

	public static void main(String[] args) {
		Solution78 sol = new Solution78();
		int[] nums = { 1, 2, 3, 4 };
		sol.subsets(nums);
	}

}
