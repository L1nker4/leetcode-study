package wang.l1n.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/18 21:22
 * @description： https://leetcode-cn.com/problems/two-sum/
 */
public class _1_两数之和 {

    public int[] twoSum1(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return null;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[2];
    }
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
