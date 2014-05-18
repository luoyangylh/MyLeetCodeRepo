/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/17/14
 * Time: 8:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int tmp = A[0];
        int sum = A[0];

        for (int i = 1; i < A.length; i++) {
            tmp = Math.max(sum + A[i], A[i]);
            sum = Math.max(sum, tmp);
        }
        return sum;

    }
}
