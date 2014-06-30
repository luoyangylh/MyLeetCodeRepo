// Pascal's Triangle II 

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> res = new ArrayList<Integer>();
    	if (rowIndex < 0) return res;

    	for (int i = 0; i <= rowIndex; i++) {
    		for (int j = i - 1; j > 0; j--) {
    			int tmp = res.get(j) + res.get(j - 1);
    			res.set(j, tmp);
    		}
    		res.add(1);
    	}
    	
        return res;
    }
}