/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/31/14
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;

        while (i >=0 && j >= 0) {
            if (A[i] > B[j]) {
                A[i + j + 1] = A[i];
                i--;
            } else {
                A[i + j + 1] = B[j];
                j--;
            }

        }


        while (j != -1) {
            A[j--] = B[j--];
        }

    }
}
