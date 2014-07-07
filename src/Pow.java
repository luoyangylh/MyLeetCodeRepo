// Pow

public class Solution {
    public double pow(double x, int n) {
    	if (n < 0) {
    		return 1 / powHelp(x, -n);
    	} else {
    		return powHelp(x, n);
    	}          
    }

    public double powHelp(double x, int n) {
    	if (n == 0) return 1;
        if (n == 1) return x;
        
        if (n % 2 != 0) {
    		return pow(x*x, n/2) * x;
    	} else {
    		return pow(x*x, n/2);
    	}       	
    }
}