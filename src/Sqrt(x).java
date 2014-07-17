// Sqrt(x) 

// Implement int sqrt(int x).

// Compute and return the square root of x.

public class Solution {
    public int sqrt(int x) {
    	//why have to use long
        long low = 0;
    	long high = x;
    	
    	while (low <= high) {
    		long mid = (low + high) / 2;
    		if (mid * mid <= x) {
    			low = mid + 1;
    		} else {
    			high = mid - 1;
    		}
    	}
    	return (int)high;
}