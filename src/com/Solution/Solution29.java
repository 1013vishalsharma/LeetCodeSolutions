package com.Solution;

public class Solution29 {

	public int divide(int dividend, int divisor) {
    
		if(dividend == -2147483648 && dividend < 0) {
			return 2147483647;
		}
		int signDivi = dividend;
		int signDiv = divisor;
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		
		if(dividend == 0 || dividend < divisor) {
			return  0;
		}
		else {
			int qou = 0;
			int count = 0;
			while(qou <= dividend) {
				qou += divisor;
				count++;
			}
			//System.out.println(qou + ", " + count);
			if((signDiv < 0 && signDivi < 0) || (signDiv > 0 && signDivi >0) ) {
				//System.out.println((count-1));
				return count-1;
			}
			else {
				//System.out.println(-(count-1));
				return -(count-1);
			}
		}
		//return 0;
    }
	
	public static void main(String[] args) {
		Solution29 sol = new Solution29();
		sol.divide(-2147483648, -1);
	}

}
