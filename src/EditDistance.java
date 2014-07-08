// Edit Distance
// DP
public class Solution {
    public int minDistance(String word1, String word2) {
    	int len1 = word1.length();
    	int len2 = word2.length();
    	int[][] f = new int[len1][len2];
    	for (int i = 0; i < len1; i++) {
    		f[i][0] = 0;
    	} 
    	for (int j = 0; j < len2; j++) {
    		f[0][j] = 0;
    	}

    	for (int i = 1; i <= len1; i++) {
    		for (int j = 1; j<= len2; j++) {
    			if (word1.charAt(i) == word2.charAt(j)) {
    				f[i][j] = f[i - 1][j - 1];
    			} else {
    				f[i][j] = Math.min(f[i-1][j], Math.min(f[i][j-1], f[i-1][j-1])) + 1;    				
    			}
    		}
    	}
        return f[i][j];
    }
}