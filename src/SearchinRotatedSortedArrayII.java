// Search in Rotated Sorted Array II

public class SearchinRotatedSortedArrayII {
    public boolean search(int[] A, int target) {
    	int begin = 0;
    	int end = A.length;
    	if (end == 0) return false;

    	while (begin < end) {
    		int mid = (begin + end) / 2;
    		if (A[mid] == target) return true;

    		if (A[mid] < A[begin]) {
    			// end - 1 not end !!!
    			if (target > A[mid] && target <= A[end - 1]) {
    				begin = mid + 1;
    			} else {
    				end = mid;
    			}
    		} else if (A[mid] > A[begin]) {
    			if (target < A[mid] && target >= A[begin]) {
    				end = mid;
    			} else {
    				begin = mid + 1;
    			}
    		} else {
                begin++;
            }
    	}
    	return false;
    }
}