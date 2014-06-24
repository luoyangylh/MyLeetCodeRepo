// Spiral Matrix II 

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int begin = 0, end = n - 1;
        int num = 1;

        while (begin < end) {
        	// from left to right
        	for (int i = begin; i < end; i++) res[begin][i] = num++;
        	// from top to bottom
        	for (int i = begin; i < end; i++) res[i][end] = num++;
        	// from right to left
        	for (int i = end; i > begin; i--) res[end][i] = num++;
        	// from bottom to top
        	for (int i = end; i > begin; i--) res[i][begin] = num++;
        	begin++;
        	end--;
        }

        if (begin == end) res[begin][begin] = num;
        return res;
    }
}