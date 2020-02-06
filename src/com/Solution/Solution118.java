package com.Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {

	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        
        if(numRows == 0) {
        	return al;
        }
        
        List<Integer> li = new ArrayList<>();
        li.add(1);
        al.add(li);
        
        for(int i=1; i<numRows; i++) {
        	List<Integer> ali = al.get(i-1);
        	List<Integer> nli = new ArrayList<>();
        	nli.add(1);
        	for(int j=1; j<ali.size(); j++) {
        		nli.add(ali.get(j-1) + ali.get(j));
        	}
        	nli.add(1);
        	al.add(nli);
        }
        return al;
    }
	
	public static void main(String[] args) {
		Solution118 sol = new Solution118();
		sol.generate(5);
	}

}
