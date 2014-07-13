// Jump Game II 

public class Solution {
    public int jump(int[] A) {
    	if (A == null) return -1;

    	int curReach = 0;
    	int nextReach = 0;
    	int step = 0;

    	for (int i = 0; i < A.length && i <= nextReach; i++) {
    		if (i > curReach) {
    			step++;
    			curReach = nextReach;
    		}
    		nextReach = Math.max(nextReach, A[i] + i);
    	}

    	if (nextReach < A.length - 1)
    		return -1;
    	else 
        	return step;
    }
}