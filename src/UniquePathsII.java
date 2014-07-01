// Unique Paths II 

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if (obstacleGrid == null) return 0;

    	int row = obstacleGrid.length;
    	int col = obstacleGrid[0].length;
    	int[][] res = new int[row][col];
    	if (obstacleGrid[0][0] == 1) 
    		return 0;
    	else
    		res[0][0] = 1;

    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < col; j++) {
    			if (i == 0 && j == 0) continue;
    			if (obstacleGrid[i][j] == 0) {
    				int left = j == 0 ? 0 : res[i][j - 1];
    				int up = i == 0 ? 0 : res[i - 1][j];
    				res[i][j] = left + up;
    			} else {
    				res[i][j] = 0;
    			}    			
    		}
    	}

    	return res[row - 1][col - 1];
        
    }
}