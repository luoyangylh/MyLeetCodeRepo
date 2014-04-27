/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 4/26/14
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {

        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            res ^= A[i];
        }
        return res;

    }
}
