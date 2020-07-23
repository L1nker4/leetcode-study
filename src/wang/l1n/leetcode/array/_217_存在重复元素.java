package wang.l1n.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 21:40
 * @description： https://leetcode-cn.com/problems/contains-duplicate/
 */
public class _217_存在重复元素 {

    /**
     * 先排序，再遍历
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1){
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * 暴力
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1){
            return false;
        }
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])){
                return true;
            }
            hashSet.add(nums[i]);
        }
        return false;
    }

}
