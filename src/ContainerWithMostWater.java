/**
 * Container With Most Water 
 * Longhua You
 *
 */	

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int begin = 0;
    	int end = height.length - 1;
    	int res = 0;

    	while (begin < end) {
    		int area = Math.min(height[begin], height[end]) * (end - begin);
    		res = Math.max(res, area);
    		if (height[begin] <= height[end]) {
    			begin++;
    		} else {
    			end--;
    		}
    	}

    	return res;
    }
}