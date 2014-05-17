/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClimbingStairs {
    int climbStairs(int n) {
        int[] res = new int[n+1];

        if (n == 1) return 1;
        if (n == 2) return 2;

        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i < n+1; i++) {
            res[i] = res[i - 1] + res[i + 1];
        }
        return res[n];
    }

}
