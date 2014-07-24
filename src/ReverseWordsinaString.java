// Reverse Words in a String
// Given an input string, reverse the string word by word.

// For example,
// Given s = "the sky is blue",
// return "blue is sky the".

public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
        	return "";
        }

        String[] strArray = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = strArray.length - 1; i >= 0; i--) {
        	if (!strArray[i].equals(""))
        		// as array may contain ""
        		sb.append(strArray[i]).append(" ");
        }

        return sb.length() == 0 ? "" : sb.substring(0, sb.length()-1);
    }
}