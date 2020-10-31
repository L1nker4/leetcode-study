package wang.l1n.pta.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/30 14:54
 * @description：
 */
public class _1030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int result = 0;
        while (left < right) {
            if (arr[right] <= arr[left] * p) {
                System.out.println(right - left + 1);
                return;
            } else {
                if (arr[right] <= arr[left + 1] * p) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
