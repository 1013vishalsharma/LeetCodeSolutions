package com.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution77 {

	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        List<Integer> li = new ArrayList<>();
        
        al = combine(al, li, n, k, 1);
		return al;
    }
	
	public List<List<Integer>> combine(List<List<Integer>> al, List<Integer> li, int n, int k, int s){
		if(k==0){
			al.add(new ArrayList<>(li));
			for (Iterator iterator = li.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.print(integer +" ");
			}
			System.out.println();
		}
		else{
			for (int i = s; i <= n; ++i) {
				li.add(i);
				combine(al, li, n, k-1, i+1);
				li.remove(li.size()-1);
			}
		}
		return al;
	}
	
	public static void main(String[] args) {
		Solution77 sol = new Solution77();
		sol.combine(5, 3);
	}

}
