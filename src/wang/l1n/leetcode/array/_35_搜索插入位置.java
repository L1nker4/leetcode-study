package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/9 16:50
 * @description： https://leetcode-cn.com/problems/search-insert-position/
 */
public class _35_搜索插入位置 {

    /**
     * 暴力
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

        //边界检查
        if (target<nums[0]){
            return 0;
        }
        if (target>nums[nums.length-1]){
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]  == target){
                return i;
            }
            if (target > nums[i] && target < nums[i + 1]){
                return i + 1;
            }
        }
        return 0;
    }


    public int searchInsert2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
