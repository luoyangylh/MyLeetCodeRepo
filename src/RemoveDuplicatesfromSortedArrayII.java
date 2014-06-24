// Remove Duplicates from Sorted Array II

public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if (A.length < 3) return A.length;
        int index = 1;

        for (int i = 2; i < A.length; i++) {
        	
        	if (A[index] != A[i] && A[index - 1] != A[i]) {
       			A[++index] = A[i];        		
        	}        	
        }
        return index + 1;
    }
}