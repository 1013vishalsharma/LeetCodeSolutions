package com.Solution;

public class Solution28 {

	public int strStr(String haystack, String needle) {
		if(needle.isEmpty() || needle == null || needle.equals(haystack))
			return 0;
		else{
			char[] arr = haystack.toCharArray();
			char[] nee = needle.toCharArray();
			
			boolean found = false;
			int index = 0;
			
			int j=0;
			
			for(int i=0; i<arr.length; i++){
				if(arr[i] == nee[j]){
					j++;
					for(int k=i+1; k<arr.length; k++){
						if(j<nee.length && arr[k] == nee[j]){
							j++;
						}
						else if(j>=nee.length){
							found = true;
							break;
						}
						else{
							j=0;
							break;
						}
					}
				}
				if(found){
					index = i;
					break;
				}
			}
			
			if(found){
				return index;
			}
			else{
				return -1;
			}
		}
    }

	public static void main(String[] args) {
		Solution28 sol = new Solution28();
		String str = "hello";
		String str1 = "hello";
		System.out.println(sol.strStr(str, str1));

	}

}
