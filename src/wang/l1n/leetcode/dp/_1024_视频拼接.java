package wang.l1n.leetcode.dp;

import java.util.Arrays;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/24 12:51
 * @description：
 */
public class _1024_视频拼接 {

    public int videoStitching(int[][] clips, int T) {
        int[] dp = new int[T + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= T; i++) {
            for (int[] clip : clips) {
                if (clip[0] < i && i <= clip[1]) {
                    dp[i] = Math.min(dp[i], dp[clip[0]] + 1);
                }
            }
        }
        return dp[T] == Integer.MAX_VALUE - 1 ? -1 : dp[T];
    }
}
