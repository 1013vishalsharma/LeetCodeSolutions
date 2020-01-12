package com.Solution;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
	
	public List<String> generateParenthesis(int n) {
		char[] arr = new char[2*n];
		List<String> para = new ArrayList<>();
        generateParan(arr, 0, n, 0, 0, para);
		return para;
    }
	
	public void generateParan(char[] arr, int pos, int n, int open, int close, List<String> para){
		if(open > close){
			arr[pos] = ')';
			generateParan(arr, pos+1, n, open, close+1, para);
		}
		if(open < n){
			arr[pos] = '(';
			generateParan(arr, pos+1, n, open+1, close, para);
		}
		if(pos == arr.length){
			for(int i=0; i<arr.length; i++){
				//System.out.print(arr[i]);
			}
			para.add(new String(arr));
			return;
		}
	}
	
	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		List<String> para = sol.generateParenthesis(3);
		for (String string : para) {
			System.out.println(string);
		}
	}

}
