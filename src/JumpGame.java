// Jump Game

public class Solution {
    public boolean canJump(int[] A) {
    	int reach = A[0];
        if (A.length <= 1) return true;
    	for (int i = 1; i < A.length; i++) {
    		if (reach >= i) {
    			reach = Math.max(reach, i + A[i]);
    		}
    		if (reach >= A.length - 1) return true;    		
    	}
        return false;
    }
}