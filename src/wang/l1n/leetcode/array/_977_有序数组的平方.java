package wang.l1n.leetcode.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/16 9:20
 * @description：
 */
public class _977_有序数组的平方 {

    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            res[i] = (int) Math.pow(A[i],2);
        }
        Arrays.sort(res);
        return res;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


}
