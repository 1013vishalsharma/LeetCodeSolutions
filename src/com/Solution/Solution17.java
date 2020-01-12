package com.Solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution17 {
	
	public List<String> letterCombinations(String digits) {
		List<String> al = new ArrayList<>();
		if(digits.isEmpty()){
			return al;
		}
		Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int level = 0;
        
        char li[] = new char[digits.length()];
        letterCom(digits, map, li, 0, level, al);
		return al;
    }
	
	public void letterCom(String digits, Map<Character, String> map, char[] li, int i, int level, List<String> al){
		if(level < digits.length()){
			char c = digits.charAt(level);
			String com = map.get(c);
			char[] arr = com.toCharArray();
			
			for(int j=0; j<arr.length; j++){
				li[level] = arr[j]; 
				level++;
				letterCom(digits, map, li, i, level, al);
				level--;
			}
		}
		else{
			for (int j = 0; j < li.length; j++) {
				System.out.print(li[j]);
			}
			al.add(new String(li));
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		sol.letterCombinations("234");
	}

}
