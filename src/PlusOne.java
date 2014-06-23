/*
 * plus one
 *
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
    	int len = digits.length;
    	int plus = 1;

    	for (int i = len - 1; i >= 0; i--) {
    		int tmp = digits[i] + plus;
    		plus = tmp / 10;
    		digits[i] = tmp % 10;
    	}

    	if (plus == 0) {
    		return digits;
    	} else {
    		int[] res = new int[len+1];
    		res[0] = 1;
    		for (int i = 1; i < len+1; i++) {
    			res[i] = digits[i-1];
    		}
    		return res;
    	}        
    }
}