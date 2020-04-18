package wang.l1n.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/18 20:58
 * @description： https://leetcode-cn.com/problems/reverse-string/
 */
public class _344_反转字符串 {
    public void reverseString(char[] s) {
        int start = 0, end = s.length -1;
        char tmp;
        while(start < end){
            tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }
}
