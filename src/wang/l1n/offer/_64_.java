package wang.l1n.offer;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/6/2 22:22
 * @description： https://leetcode-cn.com/problems/qiu-12n-lcof/
 */
public class _64_ {

    public int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n -1);
    }
}
