package wang.l1n.leetcode.array;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/21 23:11
 * @description：
 */
public class _1619_删除某些元素后的数组均值 {


    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int len1 = n/20;
        double sum = 0;
        double count = (n - 2 * len1);
        for(int i = len1;i < n - len1;i++){
            sum += arr[i];
        }

        return sum/count;
    }
}
