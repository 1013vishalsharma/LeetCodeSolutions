package com.Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
	
	public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> al = new ArrayList<List<Integer>>();
        
        if(rowIndex == 0) {
        	List<Integer> li = new ArrayList<>();
        	li.add(1);
        	return li;
        }
        
        List<Integer> li = new ArrayList<>();
        li.add(1);
        al.add(li);
        
        for(int i=1; i<=rowIndex; i++) {
        	List<Integer> ali = al.get(i-1);
        	List<Integer> nli = new ArrayList<>();
        	nli.add(1);
        	for(int j=1; j<ali.size(); j++) {
        		nli.add(ali.get(j-1) + ali.get(j));
        	}
        	nli.add(1);
        	al.add(nli);
        }
        return al.get(al.size()-1);
    }

	public static void main(String[] args) {
		Solution119 sol = new Solution119();
		sol.getRow(3);
	}

}
