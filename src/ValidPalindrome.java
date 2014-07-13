// Valid Palindrome 

public class Solution {
    public boolean isPalindrome(String s) {
    	if (s == null) return true;
    	s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    	int left = 0;
    	int right = s.length() - 1;
    	while (left < right) {
    		char cleft = Character.toLowerCase(s.charAt(left));
    		char cright = Character.toLowerCase(s.charAt(right));
    		if (cleft < 'a' || cleft > 'z') {
    			left++;
    			continue;
    		}

    		if (cright < 'a' || cright > 'z') {
    			right--;
    			continue;
    		}

    		if (cleft != cright) {
    			return false;
    		} else {
    			left++;
    			right--;
    		}
    	}
        return true;
    }


}