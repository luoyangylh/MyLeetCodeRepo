// Distinct Subsequences 

// When you see string problem that is about subsequence or matching, 
// dynamic programming method should come to your mind naturally. 
// The key is to find the changing condition.

public class Solution {
    public int numDistinct(String S, String T) {
    	int len1 = S.length();
    	int len2 = T.length();
    	int[][] res = new int[len1+1][len2+1];

    	for (int i = 0; i < len1; i++) {
    		res[i][0] = 1;
    	}

    	for (int i = 1; i <= len1; i++) {
    		for (int j = 1; j <= len2; j++) {
    			if (S.charAt(i-1) == T.charAt(j-1)) {
    				res[i][j] = res[i-1][j-1] + res[i-1][j];
    			} else {
    				res[i][j] = res[i-1][j];
    			}
    		}    		
    	}
        return res[len1][len2];
    }
}