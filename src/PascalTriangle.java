import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/17/14
 * Time: 9:28 PM
 * To change this
 * template use File | Settings | File Templates.
 */

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) return res;
        ArrayList<Integer> line = new ArrayList<Integer>();
        line.add(1);
        res.add(line);
        if(numRows == 1) return res;

        for (int i = 1; i < numRows; i++) {
            line = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                int left = j == 0 ? 0 : res.get(i-1).get(j-1);
                int right = j == i ? 0 : res.get(i-1).get(j);
                line.add(left+right);
            }
            res.add(line);

        }

        return res;


    }
}
