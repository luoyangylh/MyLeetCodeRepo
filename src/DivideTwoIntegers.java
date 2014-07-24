// Divide Two Integers 
// Divide two integers without using multiplication, division and mod operator.

public class Solution {
    public int divide(int dividend, int divisor) {
        int positive = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
        	positive = -1;
        }

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);

        int res = 0;
        while (a >= b) {
        	int move = 0;
        	while (b << move <= a) {
        		move++;
        	}
        	// move - 1 cause b << move > a
        	res += 1 << (move - 1);
        	a = a - (b << (move - 1));
        }
        return res * positive;
    }
}