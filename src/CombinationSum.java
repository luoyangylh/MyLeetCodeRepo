// Combination Sum 

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (target <= 0 || candidates == null)
    		return res;
    	Arrays.sort(candidates);
    	List<Integer> cur = new ArrayList<Integer>();
    	getCombination(candidates, target, 0, res, cur);
        return res;
    }

    public void getCombination(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> cur) {
        if (target < 0) return;
        
    	if (target == 0) {
    		res.add(new ArrayList<Integer>(cur));
    		return;
    	}

    	for (int i = start; i < candidates.length; i++) {
    		if (candidates[i] > target) {
    			break;
    		}
    		
    		cur.add(candidates[i]);
    		getCombination(candidates, target-candidates[i], i, res, cur);
    		cur.remove(cur.size()-1);
    	}
    }
}