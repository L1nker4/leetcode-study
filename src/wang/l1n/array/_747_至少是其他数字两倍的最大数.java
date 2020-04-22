package wang.l1n.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/22 10:38
 * @description： https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 */
public class _747_至少是其他数字两倍的最大数 {

    public int dominantIndex(int[] nums) {
        int maxIndex = -0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (maxIndex != j && nums[maxIndex] < (nums[j] * 2)){
                return -1;
            }
        }
        return maxIndex;
    }
}
