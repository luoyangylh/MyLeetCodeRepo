// Longest Substring Without Repeating Characters 

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	if (s == null || s.length() == 0) return 0;

    	HashSet<Character> hs = new HashSet<Character>();

    	int leftbound = 0;
    	int longest = 0;

    	for (int i = 0; i < s.length(); i++) {
    		if (hs.contains(s.charAt(i))) {
    			while (leftbound < i && s.charAt(leftbound) != s.charAt(i)) {
    				hs.remove(s.charAt(leftbound));
    				leftbound++;
    			}
    			leftbound++;
    		} else {
    			hs.add(s.charAt(i));
    			longest = Math.max(longest, i - leftbound + 1);
    		}
    	}

    	return longest;
    }
}