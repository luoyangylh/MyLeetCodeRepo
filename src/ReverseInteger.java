/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 4/27/14
 * Time: 10:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            flag = false;
            x = -x;
        }

        int res = 0;
        while (x != 0) {

            res = res * 10 + x % 10;
            x = x / 10;

        }
        return flag == true ? res : -res;
    }
}
