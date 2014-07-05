// Subsets II

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (num == null) {
    		return res;
    	} else {
    		res.add(new ArrayList<Integer>());
    	}
    	Arrays.sort(num);
    	int len = num.length;
    	for (int i = 0; i < len; i++) {
    		int size = res.size();
    		for (int j = 0; j < size; j++) {
    			ArrayList<Integer> tmp = new ArrayList<Integer>(res.get(j));
    			tmp.add(num[i]);
    			if (!res.contains(tmp))
    				res.add(tmp);
    		}
    	}
        return res;
    }
}