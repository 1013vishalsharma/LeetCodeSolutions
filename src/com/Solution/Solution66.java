package com.Solution;

public class Solution66 {

	public int[] plusOne(int[] digits) {
		int sum = 0;
		int carry = 1;
		
		for(int i=digits.length-1; i>=0; i--){
			sum = digits[i] + carry;
			if(sum > 9){
				digits[i] = 0;
				carry = 1;
			}
			else{
				digits[i] = sum;
				carry = 0;
			}
		}
		
		if(carry == 1){
			int[] digi = new int[digits.length+1];
			digi[0] = 1;
			for(int i=0; i< digits.length; i++){
				digi[i+1] = digits[i];
			}
			return digi;
		}
		return digits;
    }
	
	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		Solution66 sol = new Solution66();
		int digi[] = sol.plusOne(arr);
		
		for(int i=0; i< digi.length; i++){
			System.out.print(digi[i] + " ");
		}
	}

}
