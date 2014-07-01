// Valid Parentheses 

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> p = new Stack<Character>();
    	for (int i = 0; i < s.length(); i++) {
    		char sc = s.charAt(i);
    		if (sc == '(' || sc == '{' || sc == '[') {
    			p.push(sc);
    		} else {
    			if (p.empty()) return false;

    			char c = p.pop();
    			if (sc == ')') {
    				if (c != '(') return false;
    			} else if (sc == '}') {
    				if (c != '{') return false;
    			} else {
    				if (c != '[') return false;
    			}
    		}
    	}
    	if (p.empty()) 
    	    return true;
    	else 
    	    return false;       
    }
}