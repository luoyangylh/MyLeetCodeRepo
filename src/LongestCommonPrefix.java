// Longest Common Prefix 

public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) return "";
        
        int right_limit = strs[0].length();

    	for (int i = 1; i < strs.length; i++) {
    		for (int j = 0; j < right_limit; j++) {
    		    if (j >= strs[i].length() || strs[i].charAt(j) != strs[0].charAt(j)) {
    				right_limit = j;
    		    }
    		}
    	}
    	return strs[0].substring(0, right_limit); 
    }
}