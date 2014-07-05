// Search for a Range 

public class Solution {
    public int[] searchRange(int[] A, int target) {
    	int begin = 0;
    	int end = A.length - 1;

    	int[] res = new int[]{-1, -1};

    	while (begin <= end) {
    		int mid = (begin + end) / 2;
    		if (A[mid] == target) {
    			begin = mid;
    			end = mid;
    			while (begin - 1 >= 0 && A[begin - 1] == target) {
    				begin--;
    			}
    			while (end + 1 <= A.length - 1 && A[end + 1] == target) {
    				end++;
    			}
    			res[0] = begin;
    			res[1] = end;
    			return res;
    		} else if (A[mid] < target) {
    			begin = mid + 1;
    		} else {
    			end = mid - 1;
    		}
    	}
        return res;
    }
}