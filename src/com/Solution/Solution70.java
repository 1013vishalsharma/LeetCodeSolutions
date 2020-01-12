package com.Solution;

public class Solution70 {

	public int climbStairs(int n) {
		int[] arr= new int[n];
		
		if(n>=1){
			arr[0] = 1;
		}
		if(n>=2){
			arr[1] = arr[0] + 1; 
		}
		if(n >=3){
			for (int i = 2; i < arr.length; i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		return arr[n-1];
	}

	public static void main(String[] args) {
		Solution70 sol = new Solution70();
		System.out.println(sol.climbStairs(4));
	}

}
