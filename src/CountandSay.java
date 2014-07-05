// Count and Say 

public class Solution {
    public String countAndSay(int n) {
    	if (n < 1) return null;

    	String s = "1";
    	int count = 1;
    	for (int i = 1; i < n; i++) {
    		int len = s.length();
    		StringBuilder sb = new StringBuilder();
    		for (int j = 0; j < len; j++) {
    			if (j < len - 1 && s.charAt(j) == s.charAt(j + 1)) {
    				count++;
    			} else {
    				sb.append(count);
    				sb.append(s.charAt(j));
    				count = 1;
    			}    			
    		}
    		s = sb.toString();
    	}
        return s;
    }
}