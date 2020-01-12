package com.Solution;

public class Solution58 {
	
	public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr.length ==0){
        	return 0;
        }
        else{
        	return arr[arr.length-1].length();
        }
    }

	public static void main(String[] args) {
		Solution58 sol = new Solution58();
		System.out.println(sol.lengthOfLastWord(""));
	}

}
