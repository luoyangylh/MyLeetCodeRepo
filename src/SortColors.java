/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 6/3/14
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortColors {
    public void sortColors(int[] A) {
        int len = A.length;
        int begin = 0, end = len - 1;
        for (int i = 0; i <= end; ) {

            if (A[i] == 0) {
                A[i] = A[begin];
                A[begin] = 0;
                begin++;
                i++;

            } else if (A[i] == 2) {
                A[i] = A[end];
                A[end] = 2;
                end--;
            } else
                i++;
        }

    }
}
