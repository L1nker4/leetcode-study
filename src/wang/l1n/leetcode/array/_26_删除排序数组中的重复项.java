package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 20:16
 * @description： https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class _26_删除排序数组中的重复项 {

    /**
     * 双指针思想完成重复元素过滤
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
}
