package wang.l1n.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/6/29 13:42
 * @description： https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class _215_数组中的第K个最大元素 {

    /**
     * 偷鸡
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k ];
    }
}
