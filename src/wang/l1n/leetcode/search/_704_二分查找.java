package wang.l1n.leetcode.search;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/25 17:38
 * @description： https://leetcode-cn.com/problems/binary-search/
 */
public class _704_二分查找 {

    public int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }

}
