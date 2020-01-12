package com.Solution;

import java.util.Arrays;

public class Solution242 {
	
	public boolean isAnagram(String s, String t) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String s1 = new String(arr);
        
        char srr[] = t.toCharArray();
        Arrays.sort(srr);
        String s2 = new String(srr);
        
        if(s1.equals(s2)){
        	System.out.println(true);
        	return true;
        }
        else{
        	System.out.println(false);
        	return false;
        }
    }

	public static void main(String[] args) {
		Solution242 sol = new Solution242();
		sol.isAnagram("rat", "car");
	}

}
