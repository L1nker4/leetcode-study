package wang.l1n.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/11 17:40
 * @description： https://leetcode-cn.com/problems/happy-number/
 */
public class _202_快乐数 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }

    /**
     * 快慢指针
     * @param n
     * @return
     */
    public boolean isHappy2(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        return fastRunner == 1;
    }

}