// Regular Expression Matching
// Implement regular expression matching with support for '.' and '*'.

// '.' Matches any single character.
// '*' Matches zero or more of the preceding element.

// The matching should cover the entire input string (not partial).

// The function prototype should be:
// bool isMatch(const char *s, const char *p)

// Some examples:
// isMatch("aa","a") → false
// isMatch("aa","aa") → true
// isMatch("aaa","aa") → false
// isMatch("aa", "a*") → true
// isMatch("aa", ".*") → true
// isMatch("ab", ".*") → true
// isMatch("aab", "c*a*b") → true

public class Solution {
    public boolean isMatch(String s, String p) {
        //Java note: s.substring(n) will be "" if n == s.length(), but if n > s.length(), index oob error
        if (s.length() == 0) {
        	return canBeEmpty(p);
        }

        if (p.length() == 0) {
        	return false;
        }

        char cs = s.charAt(0);
        char cp = p.charAt(0);

        char cp_next = 'a';	// could assign any value except '*'
        if (p.length() > 1) {
        	cp_next = p.charAt(1);
        }

        if (cp_next == '*') {
        	if (compare(cs, cp)) {
        		return isMatch(s.substring(1), p) || isMatch(s, p.substring(2));
        	} else {
        		return isMatch(s, p.substring(2));
        	}
        } else {
        	if (compare(cs, cp)) {
        		return isMatch(s.substring(1), p.substring(1));
        	} else {
        		return false;
        	}
        }
    }

    public boolean compare(char cs, char cp) {
    	return cp == '.' || cs == cp;
    }

    public boolean canBeEmpty(String p) {
    	if (p.length() % 2 != 0) {
    		return false;
    	}
    	for (int i = 1; i < p.length(); i+=2) {
    		if (p.charAt(i) != '*') {
    			return false;
    		}
    	}
    	return true;
    }
}





