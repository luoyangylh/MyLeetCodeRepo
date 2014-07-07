// Add Binary 

public class Solution {
    public String addBinary(String a, String b) {
    	if (a == null) {
    		return b;
    	}
    	if (b == null) {
    		return a;
    	}

    	StringBuilder sb = new StringBuilder();
    	int carry = 0;
    	int aLen = a.length() - 1;
    	int bLen = b.length() - 1;

    	while (aLen >= 0 || bLen >= 0 || carry > 0) {
    		int num1 = aLen >= 0 ? a.charAt(aLen) : 0;
    		int num2 = bLen >= 0 ? b.charAt(bLen) : 0;

    		int curr = (num1 + num2 + carry) % 2;
    		carry = (num1 + num2 + carry) / 2;
    		sb.insert(0, curr);
    		aLen--;
    		bLen--;
    	}
    	return sb.toString();
    }
}