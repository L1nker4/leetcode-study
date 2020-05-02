package wang.l1n.stack;

import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/2 8:10
 * @description： https://leetcode-cn.com/problems/daily-temperatures/
 */
public class _739_每日温度 {


    /**
     * 暴力O(n^2)
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int curr = T[i];
            if (curr < 100) {
                for (int j = i + 1; j < len; j++) {
                    if (T[j] > curr) {
                        res[i] = j - i;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public int[] dailyTemperatures1(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }


}
