package wang.l1n.leetcode.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 21:18
 * @description： https://leetcode-cn.com/problems/rotate-array/
 */
public class _189_旋转数组 {


    /**
     * 暴力法
     *
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int tmp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                tmp = nums[j];
                nums[j] = previous;
                previous = tmp;
            }
        }
    }


    /**
     * 反转k次数组
     *
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        //如果数组长度小于旋转次数，那么执行k次和执行k % length次结果一样
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k =3;
        int[] range = Arrays.copyOfRange(arr, arr.length - k, arr.length);
        int[] ofRange = Arrays.copyOfRange(arr, 0, arr.length - k - 1);
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
