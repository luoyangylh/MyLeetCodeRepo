import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/17/14
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleNumberII {
    public int singleNumber(int[] A) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            Integer num = ht.get(A[i]);
            if (num != null) {
                ht.put(A[i], num + 1);
            }
            else {
                ht.put(A[i], 1);
            }
        }

        for (Integer key : ht.keySet()) {
            if (ht.get(key) != 3)
                return key;
        }

        return -1;

    }
}
