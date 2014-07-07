// Palindrome Partitioning

public class Solution {
    public List<List<String>> partition(String s) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	if (s == null) return res;
    	findPalindrome(s, 0, res, new ArrayList<String>());
    	return res;        
    }

    public void findPalindrome(String s, int start, List<List<String>> res, List<String> path) {
    	//to the end of the string, it is a palindrome partition
    	if (start == s.length()) {
    		res.add(new ArrayList<String>(path));
    		return;
    	}

    	for (int i = start + 1; i <= s.length(); i++) {
    		String st = s.substring(start, i);
    		if (isPalindrome(st)) {
    			path.add(st);
    			findPalindrome(s, i, res, path);
    			path.remove(path.size()-1);
    		}
    	}

    }


    public boolean isPalindrome(String s) {
    	int left = 0;
    	int right = s.length() - 1;

    	while (left < right) {
    		if (s.charAt(left) != s.charAt(right)) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	return true;
    }
}