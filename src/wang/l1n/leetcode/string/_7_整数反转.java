package wang.l1n.leetcode.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/18 21:08
 * @description： https://leetcode-cn.com/problems/reverse-integer/
 */
public class _7_整数反转 {

    /**
     * (int) n == n ? (int) n : 0
     * @param x
     * @return
     */
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
