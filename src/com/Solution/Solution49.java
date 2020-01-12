package com.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution49 {

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		
		for(int i=0; i<strs.length; i++){
			char arr[] = strs[i].toCharArray(); 
			Arrays.sort(arr);
			String str = new String(arr);
			if(!map.containsKey(str)){
				List<String> li = new ArrayList<String>();
				li.add(strs[i]);
				map.put(str, li);
			}
			else{
				map.get(str).add(strs[i]);
			}
		}
		System.out.println(map);
		return new ArrayList<>(map.values());
    }
	
	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		sol.groupAnagrams(strs);
	}

}
