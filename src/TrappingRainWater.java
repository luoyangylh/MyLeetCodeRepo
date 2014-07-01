// Trapping Rain Water

public class Solution {
    public int trap(int[] A) {
    	int len = A.length;
    	int sum = 0;
    	int[] maxleft = new int[len];
    	int[] maxright = new int[len];

    	for (int i = 1; i < len; i++) {
    		maxleft[i] = Math.max(maxleft[i - 1], A[i - 1]);
    		maxright[len - i - 1] = Math.max(maxright[len - i], A[len - i]); 
    	}

    	for (int i = 0; i < len; i++) {
    		int wall = Math.min(maxleft[i], maxright[i]);
    		if (wall > A[i]) {
    			sum += wall - A[i];
    		}
    	}

    	return sum;
        
    }
}