package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/11/10 21:26
 * @description：
 */
public class _31_下一个排列 {

    public void nextPermutation(int[] nums) {

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
