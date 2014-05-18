/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/17/14
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int tmp = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[tmp] = A[i];
                tmp++;
            }
        }
        return tmp;
    }
}
