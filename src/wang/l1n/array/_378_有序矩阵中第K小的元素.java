package wang.l1n.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/2 10:36
 * @description： https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */
public class _378_有序矩阵中第K小的元素 {

    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length, cols = matrix[0].length;
        int[] sorted = new int[rows * cols];
        int index = 0;
        for(int[] row : matrix){
            for (int num : row){
                sorted[index++] = num;
            }
        }
        Arrays.sort(sorted);
        return sorted[k - 1];
    }
}
