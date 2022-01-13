package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/11/3 15:01
 * @description：
 */
public class _941_有效的山脉数组 {

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
        }
        if (maxIndex == A.length - 1 || maxIndex == 0) {
            return false;
        }
        for (int i = 1; i < A.length - 1; i++) {
            if (i < maxIndex) {
                if (A[i] < A[i - 1]) {
                    return false;
                }
            } else {
                if (A[i] <= A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
