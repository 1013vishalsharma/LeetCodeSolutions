package com.Solution;

public class Solution74 {

	public boolean searchMatrix(int[][] matrix, int target) {

		if(matrix.length == 0){
			return false;
		}
		
		if(matrix[0].length == 0){
			return false;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
				return binarySearch(matrix[i], target);
			}
		}
		return false;
	}

	public boolean binarySearch(int[] arr, int target) {
		return binarySearch(arr, 0, arr.length - 1, target);
	}

	public boolean binarySearch(int[] arr, int l, int h, int target) {
		if (l <= h) {
			int mid = (l + h) / 2;

			if (target < arr[mid]) {
				return binarySearch(arr, l, mid - 1, target);
			} else if (target > arr[mid]) {
				return binarySearch(arr, mid + 1, h, target);
			} else if (target == arr[mid]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution74 sol = new Solution74();
		//int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int[][] matrix = {{1}};
		System.out.println(sol.searchMatrix(matrix, 1));
	}

}
