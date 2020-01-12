package com.Solution;

public class Solution62 {
	
	public int uniquePaths(int m, int n) {
        int[][] grid = new int[n][m];
        int count = 0;
        
        for (int i = 0; i < grid.length; i++) {
			grid[i][0] = 1;
		}
        
        for (int i = 0; i < grid[0].length; i++) {
			grid[0][i] = 1;
		}
        
        for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				grid[i][j] = grid[i-1][j] + grid[i][j-1];
			}
		}
        
        return grid[n-1][m-1];
		//return uniquePaths(grid, count, 0, 0);
    }

	public int uniquePaths(int[][] grid, int count, int i, int j){
		if(i==grid.length){
			return count;
		}
		if(j == grid[0].length){
			return count;
		}
		
		if(i == grid.length-1 && j == grid[0].length-1){
			count = count + 1;
			return count;
		}
		else{
			if(j < grid[0].length-1 || i < grid.length-1){
				count = uniquePaths(grid, count, i, j+1);
				count = uniquePaths(grid, count, i+1, j);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution62 sol = new Solution62();
		sol.uniquePaths(3, 2);
	}

}
