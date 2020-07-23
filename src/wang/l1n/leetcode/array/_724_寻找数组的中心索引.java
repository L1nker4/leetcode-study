package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/22 10:23
 * @description： https://leetcode-cn.com/problems/find-pivot-index/
 */
public class _724_寻找数组的中心索引 {

    /**
     * 暴力遍历
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }
            if (left == right) {
                return i;
            } else {
                left = 0;
                right = 0;
            }
        }
        return -1;
    }
}
