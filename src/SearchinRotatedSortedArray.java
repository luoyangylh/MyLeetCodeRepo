// Search in Rotated Sorted Array

public class SearchinRotatedSortedArray {
    public int search(int[] A, int target) {
    	int begin = 0;
    	int end = A.length;
    	if (end == 0) return -1;

    	while (begin < end) {
    		int mid = (begin + end) / 2;
    		if (A[mid] == target) return mid;

    		if (A[mid] < A[begin]) {
    			// end - 1 not end !!!
    			if (target > A[mid] && target <= A[end - 1]) {
    				begin = mid + 1;
    			} else {
    				end = mid;
    			}
    		} else {
    			if (target < A[mid] && target >= A[begin]) {
    				end = mid;
    			} else {
    				begin = mid + 1;
    			}
    		}
    	}
    	return -1;
    }
}