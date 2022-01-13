package wang.l1n.leetcode.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/12/23 12:31
 * @description：
 */
public class _41_缺失的第一个正数 {

    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while((nums[i] >= 1 && nums[i] <= nums.length) && (nums[i] != nums[nums[i] - 1])){
                int temp = nums[i];
                nums[i] = nums[temp -1];
                nums[temp -1] = temp;
            }
            System.out.println(Arrays.toString(nums));
        }
        int res = nums.length + 1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != (i + 1)) {
                res = i + 1;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3,4,-1,1};
        firstMissingPositive(arr);
    }
}
