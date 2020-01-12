package com.Solution;

import java.util.List;

public class Solution54 {

	public List<Integer> spiralOrder(int[][] matrix) {
		int r = 0, c = 0, mr = matrix.length, mc = matrix[0].length, k =r, l=c;
		String str = "";
		while (r < mr && c < mc) {
			int i=0;

			// top row
			for (i = c; i < mc - 1; i++) {
				str = str + matrix[r][i] + " ";
				c = i + 1;
			}
			System.out.println(str);

			// last column
			for (i = r; i < mr - 1; i++) {
				str = str + matrix[i][c] + " ";
				r = i + 1;
			}
			System.out.println(str);

			// bottom row
			if (r < mr) {
				for (i = c; i > l; i--) {
					str = str + matrix[r][i] + " ";
					c = i - 1;
				}
				System.out.println(str);
			}

			// first column
			if (c < mc) {
				for (i = r; i > k; i--) {
					str = str + matrix[i][c] + " ";
					r = i - 1;
				}
				System.out.println(str);
			}
			
			r++;
			c++;
			k=r;
			l=c;
			mr--;
			mc----;
		}
		return null;
	}

	public static void main(String[] args) {
		Solution54 sol = new Solution54();
//		int matrix[][] = { { 1, 2, 3, 4 },
//							{ 5, 6, 7, 8 },
//							{ 9, 10, 11, 12 },
//							//{ 13, 14, 15, 16 }
//							};
		
		int matrix[][] ={ { 1, 2, 3, 4, 5, 6 }, 
            { 7, 8, 9, 10, 11, 12 }, 
            { 13, 14, 15, 16, 17, 18 } }; 
		sol.spiralOrder(matrix);
	}

}
