// Palindrome Number 

public class Solution {
    public boolean isPalindrome(int x) {
    	if (x < 0) return false;

    	int res = reverse(x);
    	if (res == x)
    		return true;
    	else
    		return false;        
    }

    public int reverse(int x) {
    	int res = 0;
    	while (x != 0) {
    		res = res * 10 + x % 10;
    		x = x / 10;
    	}
    	return res;
    }
}