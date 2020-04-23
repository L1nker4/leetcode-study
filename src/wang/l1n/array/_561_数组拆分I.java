package wang.l1n.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/23 20:53
 * @description： https://leetcode-cn.com/problems/array-partition-i/
 */
public class _561_数组拆分I {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
