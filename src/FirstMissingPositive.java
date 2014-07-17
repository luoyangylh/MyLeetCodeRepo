// First Missing Positive 
public class Solution {
    public int firstMissingPositive(int[] A) {
    	if (A == null) return 1;
    	Arrays.sort(A);
    	int positive = 1;
    	for (int i = 0; i < A.length; i++) {
    		if (A[i] <= 0) {
    			continue;
    		}
    		if (A[i] > positive) {
    			return positive;
    		} else if (A[i] == positive) {
    			positive++;
    		}
    	}
    	return positive;
    }
}