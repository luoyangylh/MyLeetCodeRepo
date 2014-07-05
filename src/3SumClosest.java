// 3Sum Closest

public class Solution {
    public int threeSumClosest(int[] num, int target) {
    	int clo = Integer.MAX_VALUE;
    	int len = num.length;
    	int res = 0;
    	Arrays.sort(num);
    	for (int i = 0; i < len - 2; i++) {
    		int left = i + 1;
    		int right = len - 1;
    		while (left < right) {
    			int sum = num[i] + num[left] + num[right];
    			int tmp = Math.abs(target - sum);
    			if (tmp < clo) {
    				clo = tmp;
    				res = sum;
    			}

    			if (sum == target) {
    				return target;
    			} else if (sum < target) {
    				left++;
    			} else {
    				right--;
    			}
    		}
    		
    	}
        return res;
    }
}