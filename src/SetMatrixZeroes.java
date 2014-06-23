// Set Matrix Zeroes 

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
    	int row = matrix.length;
    	int col = matrix[0].length;

        boolean[] row_z = new boolean[row];
        boolean[] col_z = new boolean[col];

    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < col; j++) {
    			if (matrix[i][j] == 0) {
    				row_z[i] = true;
    				col_z[j] = true;
    			}
    		}
    	}

    	for (int i = 0; i < row; i++) {
    		if (row_z[i]) {
    			Arrays.fill(matrix[i], 0);
    		}
    	}

    	for (int j = 0; j < col; j++) {
    		if (col_z[j]) {
    			for (int i = 0; i < row; i++) {
    				matrix[i][j] = 0;
    			}
    		}
    	}
        
    }
}