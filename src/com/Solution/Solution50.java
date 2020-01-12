package com.Solution;

public class Solution50 {

	public double myPow(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			if (n == Integer.MIN_VALUE) {
				if (x == -1)
					return 1; // x=-1 and n =min
				n = -(n + 1); // to handle overflow
			} else
				n = -n;
			x = 1 / x;
			return myPow(x, n);
		}
		else
		{
			double temp = myPow(x, n / 2);
			if (n % 2 == 0) {
				return temp * temp;
			} else {
				return x * temp * temp;
			}
		}
	}

	public static void main(String[] args) {
		Solution50 sol = new Solution50();
		System.out.println(sol.myPow(2.00000, -2));
	}

}
