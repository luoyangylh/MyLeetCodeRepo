// Valid Sudoku

public class Solution {
    public boolean isValidSudoku(char[][] board) {
    	int len = board.length;
    	boolean[] used = new boolean[len];

    	for (int row = 0; row < len; row++) {
    		//check line
    		Arrays.fill(used, false);
    		for (int col = 0; col < len; col++) {
    			if (hasUsed(board[row][col], used)) return false;
    		}
    		//check column
    		Arrays.fill(used, false);
    		for (int col = 0; col < len; col++) {
    			if (hasUsed(board[col][row], used)) return false;
    		}
    	}

    	for (int r = 0; r < len / 3; r++) {
    		for (int c = 0; c < len / 3; c++) {
    			Arrays.fill(used, false);
    			for (int row = r * 3; row < r * 3 + 3; row++) {
    				for (int col = c * 3; col < c * 3 + 3; col++) {
    					if (hasUsed(board[row][col], used)) 
    						return false;
    				}
    			}
    		}
    	}
        return true;
    }

    public boolean hasUsed(char c, boolean used[]) {
    	if (c == '.') return false;
    	if (used[c - '1']) return true;
    	used[c - '1'] = true;
    	return false;
    }
}



