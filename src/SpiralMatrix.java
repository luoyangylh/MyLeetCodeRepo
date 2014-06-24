// Spiral Matrix

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new ArrayList<Integer>();
    	if (matrix.length == 0) return res;
    	int row_begin = 0;
    	int row_end = matrix.length - 1;
    	int col_begin = 0;
    	int col_end = matrix[0].length - 1;

    	while (true) {
    		//from left to right
    		for (int i = col_begin; i <= col_end; i++) {
    			res.add(matrix[row_begin][i]);
    		}
    		row_begin++;
    		if (row_begin > row_end) break;

    		//from top to bottom
    		for (int i = row_begin; i <= row_end; i++) {
    			res.add(matrix[i][col_end]);
    		}
    		col_end--;
    		if (col_begin > col_end) break;

    		//from right to left
    		for (int i = col_end; i >= col_begin; i--) {
    			res.add(matrix[row_end][i]);
    		}
    		row_end--;
    		if (row_begin > row_end) break;

    		//from bottom to top
    		for (int i = row_end; i >= row_begin; i--) {
    			res.add(matrix[i][col_begin]);
    		}
    		col_begin++;
    		if (col_begin > col_end) break;

    	}
    	return res;
        
    }
}
