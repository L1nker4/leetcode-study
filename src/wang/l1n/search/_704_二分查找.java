package wang.l1n.search;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/25 17:38
 * @description： https://leetcode-cn.com/problems/binary-search/
 */
public class _704_二分查找 {

    public int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }

}
