package wang.l1n.leetcode;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/26 16:23
 * @description： https://leetcode-cn.com/problems/climbing-stairs/
 */
public class _70_爬楼梯 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
