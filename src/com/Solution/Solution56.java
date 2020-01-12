package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
	
	public int[][] merge(int[][] intervals) {
		
		if(intervals.length == 0 || intervals.length==1){
			return intervals;
		}
        
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b){
				if(a[0] > b[0]){
					return 1;
				}
				else if(a[0] < b[0]){
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		
		int index = 0;
		
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[index][1] >= intervals[i][0]){
				intervals[index][0] = Math.min(intervals[index][0], intervals[i][0]);
				intervals[index][1] = Math.max(intervals[index][1], intervals[i][1]);
			}
			else {
				index++;
				intervals[index] = intervals[i];
				//index++;
			}
		}
		
		List<int[]> li = new ArrayList<>();
		for(int i=0; i<=index; i++){
			System.out.println(intervals[i][0] + ", " + intervals[i][1]);
			li.add(intervals[i]);
		}
		return li.toArray(new int[li.size()][]);
		//return null;
    }

	public static void main(String[] args) {
		Solution56 sol = new Solution56();
		int[][] intervals = {
//				{1,3},
//				{2,6},
//				{8,10},
//				{15,18}
				
//				{1,4},
//				{4,5}
				
//				{6,8},
//				{1,9},
//				{2,4},
//				{4,7}
				
				{1,4},
				{5,6}
				};
		
		sol.merge(intervals);
	}

}
