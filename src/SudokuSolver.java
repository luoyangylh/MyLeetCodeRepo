// Sudoku Solver 

// Write a program to solve a Sudoku puzzle by filling the empty cells.

// Empty cells are indicated by the character '.'.

public class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;

        solve(board);
    }

    public boolean solve(char[][] board) {
    	for (int i = 0; i < board.length; i++) {
    		for (int j = 0; j < board[0].length; j++) {
    			if (board[i][j] != '.') {
    				continue;
    			}

    			for (int n = 1; n <= 9; n++) {
    				board[i][j] = (char)(n + '0');
    				if (isValid(board, i, j) && solve(board)) {
    					// return at last step
    					return true;
    				}
    				board[i][j] = '.';
    			}
    			// from 1 to 9, all failed. Thus go back to last board
    			return false;
    		}
    	}
    	// Go through all the grid in board, and return true
    	return true;
    }

    public boolean isValid(char[][] board, int i, int j) {
    	// go through the row i
    	HashSet<Character> hs = new HashSet<Character>();
    	for (int k = 0; k < 9; k++) {
    		if (hs.contains(board[i][k])) {
    			return false;
    		}
    		if (board[i][k] > '0' && board[i][k] <= '9') {
	    		hs.add(board[i][k]);
    		}
    	}

    	// go through the column
    	hs = new HashSet<Character>();
    	for (int k = 0; k < 9; k++) {
    		if (hs.contains(board[k][j])) {
    			return false;
    		}
    		if (board[k][j] > '0' && board[k][j] <= '9') {
	    		hs.add(board[k][j]);
    		}
    	}

    	// go throught square 3 * 3
    	hs = new HashSet<Character>();
    	for (int row = i / 3 * 3; row < i / 3 * 3 + 3; row++) {
    		for (int col = j / 3 * 3; col < j / 3 * 3 + 3; col++) {
    			if (hs.contains(board[row][col]))
    				return false;
    			if (board[row][col] > '0' && board[row][col] <= '9')
    				hs.add(board[row][col]);
    		}
    	}

    	return true;
    }
}










