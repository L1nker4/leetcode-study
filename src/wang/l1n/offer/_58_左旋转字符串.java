package wang.l1n.offer;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/16 15:23
 * @description：
 */
public class _58_左旋转字符串 {

    public String reverseLeftWords(String s, int n) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            shift(arr);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }

    public static void shift(char[] arr) {
        char temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public String reverseLeftWords1(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public String reverseLeftWords2(String s, int n) {
        return null;
    }

}
