package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/25 14:32
 * @description：
 */
public class _845_数组中的最长山脉 {

    public int longestMountain(int[] A) {
        int ans = 0;
        int start = -1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                if (i == 1 || A[i - 2] >= A[i - 1]) {
                    start = i - 1;
                }
            } else if (A[i - 1] > A[i]) {
                if (start != -1) {
                    ans = Math.max(ans, i - start + 1);
                }
            } else {
                start = -1;
            }
        }
        return ans;
    }
}
