package wang.l1n.offer;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/23 10:42
 * @description：  https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class _58_II_左旋转字符串 {

    /**
     * 暴力法，每次移动一位
     * 时间复杂度为O(m * n)，m为移动次数，n为字符串长度
     * 空间复杂度为O(1)
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        while (n-- > 0){
            leftShiftOne(chars, s.length());
        }
        return String.valueOf(chars);
    }

    public void leftShiftOne(char[] s, int n){
        char t = s[0];
        for (int i = 1; i < s.length; i++) {
            s[i - 1] = s[i];
        }
        s[n - 1] = t;
    }

    /**
     * 切片 拼接
     * 时间复杂度：O(n)，n为字符串长度
     * 空间复杂度：O(n)
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords1(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    /**
     * 时间复杂度：O(n)，n为字符串长度
     * 空间复杂度：O(n)
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords2(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        _58_II_左旋转字符串 test = new _58_II_左旋转字符串();
        String s = "helloworld";
        String s1 = test.reverseLeftWords(s, 3);
        System.out.println(s1);
    }
}
