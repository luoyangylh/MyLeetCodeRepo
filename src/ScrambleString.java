// Scramble String

// Using dp
// scram[n][i][j] is scramable means s1[i, i+n] and s2[j, j+n] are scramble
// only when scram[k][i][j] && scram[n-k-1][i+k+1][j+k+1] || scram[k][i][j+n-k] && scram[n-k-1][i+k+1][j]
public class Solution {
    public boolean isScramble(String s1, String s2) {
    	if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return true;
        }

        int len = s1.length();
        // store result in a 3-d array
        boolean[][][] scram = new boolean[len][len][len];
        // check for one char
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                scram[0][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }
        // calculate scram[n-1][i][j] means i and i+n-1
        // by (scram[k-1][i][j] && scram[n-k-1][i+k][j+k]) || (scram[k-1][i][j+n-k] && scram[n-k-1][i+k][j])
        for (int n = 2; n <= len; n++) {
            for (int i = len - n; i >= 0; i--) {
                for (int j = len - n; j >= 0; j--) {
                    boolean r = false;
                    for (int k = 1; k < n && r == false; k++) {
                        r = (scram[k-1][i][j] && scram[n-k-1][i+k][j+k]) || (scram[k-1][i][j+n-k] && scram[n-k-1][i+k][j]);                        
                    }
                    scram[n-1][i][j] = r;
                }
            }
        }
        
        return scram[len-1][0][0];
    }
}