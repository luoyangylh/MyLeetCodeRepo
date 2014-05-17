/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int i = 0;
        for (; i < A.length;) {
            if (target <= A[i]) {
                return i;
            } else {
                i++;
            }
        }

        return i;
    }
}
