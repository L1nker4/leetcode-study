package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/1 22:09
 * @description： https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 */
public class _718_最长重复子数组 {


    /**
     * 暴力法
     * O(n^3)
     * @param A
     * @param B
     * @return
     */
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < B.length - 1; j++) {
                int k = 0;
                while (A[i + k] == B[j + k]){
                    k++;
                }
                ans = Math.max(ans, k);
            }
        }
        return ans;
    }

    /**
     * TODO: 动态规划，滑动窗口
     * @param A
     * @param B
     * @return
     */
    public int findLength2(int[] A, int[] B) {
        return 0;
    }
}
