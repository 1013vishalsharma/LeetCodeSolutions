package com.Solution;

public class Solution63 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if(obstacleGrid[i][j] == 1){
					obstacleGrid[i][j] = Integer.MIN_VALUE;
				}
			}
		}
        
        for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				System.out.print(obstacleGrid[i][j] + " ");
			}
			System.out.println();
		}
        
        for (int i = 0; i < obstacleGrid[0].length; i++) {
			if(obstacleGrid[0][i] != Integer.MIN_VALUE){
				obstacleGrid[0][i] = 1;
			}
			else{
				break;
			}
		}
        
        for (int i = 0; i < obstacleGrid.length; i++) {
			if(obstacleGrid[i][0] != Integer.MIN_VALUE){
				obstacleGrid[i][0] = 1;
			}
			else {
				break;
			}
		}
        
        for (int i = 1; i < obstacleGrid.length; i++) {
			for (int j = 1; j < obstacleGrid[0].length; j++) {
				if(obstacleGrid[i][j] == Integer.MIN_VALUE){
					continue;
				}
				else{
					if(obstacleGrid[i][j-1] == Integer.MIN_VALUE && obstacleGrid[i-1][j] == Integer.MIN_VALUE){
						continue;
					}
					else if(obstacleGrid[i][j-1] == Integer.MIN_VALUE){
						obstacleGrid[i][j] = obstacleGrid[i-1][j];
					}
					else if(obstacleGrid[i-1][j] == Integer.MIN_VALUE){
						obstacleGrid[i][j] = obstacleGrid[i][j-1];
					}
					else{
						obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
					}
				}
			}
		}
        
        System.out.println(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]);
        
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == Integer.MIN_VALUE){
            return 0;
        }
		return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
	
	public static void main(String[] args) {
		Solution63 sol = new Solution63();
		int[][] obstacleGrid = {
		                        {0,1},
		                        //{0,1,0},
		                        //{0,0,0}
		                       };
		sol.uniquePathsWithObstacles(obstacleGrid);
	}

}
