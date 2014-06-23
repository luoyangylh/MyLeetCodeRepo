//Minimum Path Sum
//Longhua You

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	int res = 0;
    	if (grid.length == 0) {
    		return res;
    	}
    	int row = grid.length - 1;
    	int col = grid[0].length - 1;
    	return path(row, col, grid);
    }
    //Time Limit Exceeded =.=!
    public int path(int row, int col, int[][] grid) {
    	if (row == 0 && col == 0) {
    		return grid[row][col];
    	} else if (row == 0) {
    		return path(row, col - 1, grid) + grid[row][col];
    	} else if (col == 0) {
    		return path(row - 1, col, grid) + grid[row][col];
    	} else {
    		return Math.min(path(row - 1, col, grid), path(row, col - 1, grid)) + grid[row][col];
    	}
    }

    //Second Method -- Dynamic Programming
    public int minPath(int[][] grid) {
    	if (grid.length == 0) return 0;
    	int row = grid.length - 1;
    	int col = grid[0].length - 1;

    	int[][] f = new int[row + 1][col + 1];
    	f[0][0] = grid[0][0];
    	for (int i = 1; i <= row; i++) {
    		f[i][0] = f[i - 1][0] + grid[i][0];
    	}
    	for (int i = 1; i <= col; i++) {
    		f[0][i] = f[0][i - 1] + grid[0][i];
    	}

    	for (int i = 1; i <= row; i++) {
    		for (int j = 1; j <= col; j++) {
    			f[i][j] = Math.min(f[i - 1][j], f[i][j - 1]) + grid[i][j];
    		}
    	}
    	return f[row][col];
    }
}



