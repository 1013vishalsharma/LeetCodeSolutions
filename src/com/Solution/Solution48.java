package com.Solution;

public class Solution48 {

	public void rotate(int[][] matrix) {

		int temp = 0, temp2 = 0, len = matrix.length - 1, n = matrix.length, rc = matrix.length, sc = 0, sr = 0,
				ec = matrix.length - 1, er = matrix.length;

		while (n > 0) {
			while (len > 0) {
				// for top rows
				for (int i = sr, j = sc; j < rc; j++) {
					if (j == sc) {
						temp = matrix[i][j];
						continue;
					} else {
						temp2 = matrix[i][j];
						matrix[i][j] = temp;
						temp = temp2;
					}
				}

				// for last column
				for (int j = rc - 1, i = sr+1; i < rc; i++) {
					temp2 = matrix[i][j];
					matrix[i][j] = temp;
					temp = temp2;
				}

				// for last row
				for (int i = rc - 1, j = rc - 1 - 1; j > sc; j--) {
					temp2 = matrix[i][j];
					matrix[i][j] = temp;
					temp = temp2;
				}

				// for first column
				for (int i = rc - 1, j = sc; i >= sr; i--) {
					temp2 = matrix[i][j];
					matrix[i][j] = temp;
					temp = temp2;
				}

				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				len--;
			}
			n = n / 2;
			rc = rc - 1;
			len = rc - 2;
			sc = sc + 1;
			sr = sr + 1;
			ec = ec - 1;
			er = er - 1;
			dsdf
		}
	}

	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		 int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 },
		 { 15, 14, 12, 16 } };
		//int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6}, { 7,8,9} };
		
		//int[][] matrix = {{2,29,20,26,16,28},{12,27,9,25,13,21},{32,33,32,2,28,14},{13,14,32,27,22,26},{33,1,20,7,21,7},{4,24,1,6,32,34}};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		sol.rotate(matrix);
	}
}
