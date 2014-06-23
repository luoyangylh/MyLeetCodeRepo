import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 6/4/14
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>(n);
        if (n == 0) return res;

        String tmp = "";
        dfs(res, tmp, n, n);
        return res;
    }

    public void dfs(List<String> res, String tmp, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(tmp);
            return;
        }

        if (left > 0)
            dfs(res, tmp + '(', left - 1, right);

        if (left < right)
            dfs(res, tmp + ')', left, right - 1);

    }
}
