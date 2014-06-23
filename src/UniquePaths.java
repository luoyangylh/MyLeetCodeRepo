// Unique Paths 

public class UniquePaths {
    public int uniquePaths(int m, int n) {
    	int[][] res = new int[m][n];
    	res[0][0] = 1;
    	for (int i = 0; i < m; i++) {
    		for (int j = 0; j < n; j++) {
    			if (i == 0 && j == 0) continue;
    			int left = j == 0 ? 0 : res[i][j - 1];
    			int up = i == 0 ? 0 : res[i - 1][j];
    			res[i][j] = left + up;
    		}
    	}
        return res[m - 1][n - 1];
    }
}