package wang.l1n.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/1 22:16
 * @description： https://leetcode-cn.com/problems/palindrome-number/
 */
public class _9_回文数 {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10) == 0 && x != 0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (x > 0) {
            list.add(x % 10);
            x = x / 10;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10) == 0 && x != 0) {
            return false;
        }
        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
