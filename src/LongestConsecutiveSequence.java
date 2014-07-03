// Longest Consecutive Sequence 

public class Solution {
    public int longestConsecutive(int[] num) {
    	//use hashset to solve
    	Set<Integer> set = new HashSet<Integer>();
    	int res = 0;
    	for (int n : num)
    		set.add(n);

    	for (int n : num) {
    		int left = n - 1;
    		int right = n + 1;
    		int len = 1;
    		while (set.contains(left)) {
    			len++;
    			set.remove(left);
    			left--;
    		}
    		while (set.contains(right)) {
    			len++;
    			set.remove(right);
    			right++;
    		}

    		res = Math.max(res, len);
    	}
        return res;
    }
}