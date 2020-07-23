package wang.l1n.leetcode.array;

import java.util.HashSet;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/11 17:27
 * @description： https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class _349_两个数组的交集 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] arr = new int[set2.size()];
        int j = 0;
        for (int i : set2) {
            arr[j++] = i;
        }
        return arr;
    }
}
