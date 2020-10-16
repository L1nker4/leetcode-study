package wang.l1n.offer;

import java.util.Arrays;

public class _59_滑动窗口的最大值 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length ==0 || k == 0){
            return new int[]{};
        }
        int count = nums.length - k + 1;
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            int[] arr = Arrays.copyOfRange(nums,i, i + k);
            result[i] = maxInArray(arr);
        }
        return result;
    }

    public static int maxInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
