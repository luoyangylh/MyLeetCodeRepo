// Combination Sum II 

public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (num == null) return res;
    	Arrays.sort(num);
    	List<Integer> cur = new ArrayList<Integer>();
    	getCombination(num, target, 0, res, cur);
    	return res;
    }

    public void getCombination(int[] num, int target, int start, List<List<Integer>> res, List<Integer> cur) {
    	if (target == 0) {
    		res.add(new ArrayList<Integer>(cur));
    		return;
    	}

    	for (int i = start; i < num.length; i++) {
    		if (num[i] > target) {
    			break;
    		}

    		cur.add(num[i]);
    		getCombination(num, target-num[i], i+1, res, cur);
    		cur.remove(cur.size()-1);
    	}
    }
}