// Implement strStr() 

public class Solution {
    public String strStr(String haystack, String needle) {
        int lenh = haystack.length();
        int lenn = needle.length();
        if (lenh == 0 && lenn == 0)
		    return "";
	    if (lenn == 0)
		    return haystack;

        for (int i = 0; i < lenh - lenn + 1; i++) {
        	for (int j = 0; j < lenn; j++) {
        		if (haystack.charAt(i+j) != needle.charAt(j)) {
        			break;
        		}
        		if (j == lenn - 1) {
        			return haystack.substring(i);
        		}
        	}
        }
        return null;
    }
}