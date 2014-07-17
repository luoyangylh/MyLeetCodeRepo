// Scramble String

public class Solution {
    public boolean isScramble(String s1, String s2) {
    	char[] c1 = s1.toCharArray();
    	char[] c2 = s2.toCharArray();

    	Arrays.sort(c1);
    	Arrays.sort(c2);

    	String ns1 = new String(c1);
    	String ns2 = new String(c2);

    	if (ns1.equals(ns2)) {
    		return true;
    	} else {
    		return false;
    	}
        
    }
}