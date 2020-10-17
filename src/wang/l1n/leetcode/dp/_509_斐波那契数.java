package wang.l1n.leetcode.dp;

public class _509_斐波那契数 {

    /**
     * DP Table
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1 || N == 2) {
            return 1;
        }
        int[] dp = new int[N + 1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }

    public int fib1(int N) {
        if (N == 0){
            return 0;
        }
        if (N == 1 || N == 2){
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 3; i <= N; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
