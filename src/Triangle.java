// Triangle
// DP
// f(i,j) = min(f(i+1, j), f(i+1), j+1) + f(i,j)

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	int size = triangle.size();
    	int[] line = new int[size];

    	for (int i = 0; i < size; i++) {
    		line[i] = triangle.get(size-1).get(i);
    	}

        for (int i = size - 2; i >= 0; i--) {
        	for (int j = 0; j <= i; j++) {
        		line[j] = Math.min(line[j], line[j+1]) + triangle.get(i).get(j);

        	}
        }

        return line[0];
    }
}