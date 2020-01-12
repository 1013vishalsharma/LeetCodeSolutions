package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution40 {
	
	static boolean back = false;
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> li = new ArrayList<Integer>();
        int level = 0;
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        comSum(candidates, target, li, level, al);
        System.out.println();
		return al;
    }
	
	public void comSum(int[] candidates, int target, List<Integer> li, int i, List<List<Integer>> al){
		if(i < candidates.length){
			int ans = target - candidates[i];
			if(ans > 0){
				li.add(candidates[i]);
				i++;
				comSum(candidates, ans, li, i, al);
				i--;
				li.remove(li.size()-1);
			}
			else if(ans < 0){
				back = true;
				return;
			}
			else if(ans == 0){
				li.add(candidates[i]);
				for (Iterator iterator = li.iterator(); iterator.hasNext();) {
					Integer integer = (Integer) iterator.next();
					System.out.print(integer + " ");
				}
				System.out.println();
				List<Integer> ali = new ArrayList<>(li);
				if(!al.contains(ali))
					al.add(ali);
				li.remove(li.size()-1);
			}
			i++;
			comSum(candidates, target, li, i, al);
		}
	}

	public static void main(String[] args) {
		Solution40 sol = new Solution40();
		//int[] arr = {10,1,2,7,6,1,5};
		int[] arr = {2,5,2,1,2};
		sol.combinationSum2(arr, 5);
	}

}
