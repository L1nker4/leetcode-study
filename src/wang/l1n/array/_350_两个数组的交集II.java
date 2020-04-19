package wang.l1n.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 22:18
 * @description： https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 */
public class _350_两个数组的交集II {


    /**
     * HashMap记录其中一个数组元素出现次数键值对
     * 再遍历另一个数组，判断是否在其中
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect1(int[] nums1, int[] nums2) {

        int len1 = nums1.length, len2 = nums2.length, count = 0;

        int[] res = new int[len1];

        if (len1 == 0 || len2 == 0) {
            return new int[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) == 0) {
                    continue;
                } else {
                    res[count++] = num;
                    map.put(num, map.get(num) - 1);
                }
            }
        }

        return Arrays.copyOfRange(res, 0, count);
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                // 从 list1 除去已匹配的数值
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            res[i++] = num;
        }
        return res;
    }

}
