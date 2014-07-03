// Subsets

public class Solution {
    public List<List<Integer>> subsets(int[] S) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (S == null)
    		return res;
    	else
    		res.add(new ArrayList<Integer>());
    	Arrays.sort(S);
    	int len = S.length;
    	for (int i = 0; i <= len; i++) {
    		int size = res.size();
    		for (int j = 0; j < size; j++) {
    			List<Integer> tmp = new ArrayList<Integer>(res.get(j));
    			tmp.add(S[i]);
    			res.add(tmp);
    		}
    	}
        return res;
    }
}