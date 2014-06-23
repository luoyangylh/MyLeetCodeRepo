// Search a 2D Matrix 
public class Searcha2DMatrix {
	//divide and conquer
	public boolean searchMatrixFast(int[][] matrix, int target) {
		if (matrix.length == 0) return false;

    	int row = matrix.length;
    	int col = matrix[0].length;

    	int begin = 0;
    	//not row*col -1 to include matrix[0][0] in the loop
    	int end = row * col;

    	while (begin < end) {
    		int mid = (begin + end) / 2;
    		int num = matrix[mid / col][mid % col];
    		if (num == target) {
    			return true;
    		} else if (num < target) {
    			begin = mid + 1;
    		} else {
    			end = mid;
    		}
    	}
    	return false;
	}

	//bad method
    public boolean searchMatrix(int[][] matrix, int target) {
    	if (matrix.length == 0) return false;

    	int row = matrix.length;
    	int col = matrix[0].length;
    	if (target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
    		return false;
    	}
    	int in_row = 0;
    	int in_col = 0;
    	for (int i = 0; i < row; i++) {
    		if (target >= matrix[i][0]) {
    			in_row = i;
    		} else {
    			break;
    		}
    	}

    	for (int j = 0; j < col; j++) {
    		if (target == matrix[in_row][j]) {
    			return true;
			} else if (target < matrix[in_row][j]) {
    			return false;
    		}
   		}

    	return false;        
    }

}