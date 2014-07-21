// // Multiply Strings

// Given two numbers represented as strings, return multiplication of the numbers as a string.

// Note: The numbers can be arbitrarily large and are non-negative.


public class Solution {
    public String multiply(String num1, String num2) {
    	if (num1==null||num1.length()==0||num2==null||num2.length()==0){
            return null;
        }

        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();
        //as 99 * 99, length < 5, (10000)
        int[] d = new int[n1.length() + n2.length()];

        //calculate for every digit
        for (int i = 0; i < n1.length(); i++) {
        	int a = n1.charAt(i) - '0';
        	for (int j = 0; j < n2.length(); j++) {
        		int b = n2.charAt(j) - '0';
        		d[i+j] += a * b;
        	}
        }

        StringBuilder sb = new StringBuilder();
        // calculate real result
        for (int i = 0; i < d.length; i++) {
        	int digit = d[i] % 10;
        	int carry = d[i] / 10;
        	sb.insert(0, digit);
        	if (i < d.length - 1) {
        		d[i + 1] += carry;
        	}
        }
        // delete all the zeros at the begining
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}