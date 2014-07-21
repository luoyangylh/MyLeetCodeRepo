// Word Break
// Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

// For example, given
// s = "leetcode",
// dict = ["leet", "code"].

// Return true because "leetcode" can be segmented as "leet code".

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
    	if (s == null || s.length() == 0) {
    		return false;
    	}

    	//get length of the longest word in dict
    	int maxLen = 0;
    	for (String ss: dict) {
    		maxLen = Math.max(maxLen, ss.length());
    	}
        int len = s.length();
        boolean[] canSegment = new boolean[len+1];
        canSegment[0] = true;

        for (int i = 1; i <= len; i++) {
        	canSegment[i] = false;
        	for (int j = 1; j <= i && j <= maxLen; j++) {
        		if (!canSegment[i - j]) {
        			continue;
        		}
        		String subs = s.substring(i-j, i);
        		if (dict.contains(subs)) {
        			canSegment[i] = true;
        			break;
        		}
        	}
        }
        return canSegment[len];
    }
}