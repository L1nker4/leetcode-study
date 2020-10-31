package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/26 15:22
 * @description： https://leetcode-cn.com/problems/move-zeroes/
 */
public class _283_移动零 {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j] = nums[i];
                if (i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
