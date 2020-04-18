package wang.l1n.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 21:57
 * @description： https://leetcode-cn.com/problems/single-number/
 */
public class _136_只出现一次的数字 {


    /**
     * HashMap记录元素与出现的次数的键值对
     * @param nums
     * @return
     */
    public int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i : nums) {
            table.put(i, table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }


    /**
     * 通过列表进行筛选无重复元素
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                int index = list.indexOf(nums[i]);
                list.remove(index);
            } else {
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }

    /**
     *  a ^ 0 = a
     *  a ^ a = 0
     * @param nums
     * @return
     */
    public int singleNumber3(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }


}
