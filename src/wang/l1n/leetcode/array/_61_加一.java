package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/18 20:32
 * @description： https://leetcode-cn.com/problems/plus-one/
 */
public class _61_加一 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        int[] res;
        if (digits[0] == 0) {
            res = new int[length+1];
            res[0] = 1;
        } else {
            return digits;
        }
        return res;
    }
}
