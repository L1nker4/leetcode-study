package wang.l1n.stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/2 14:14
 * @description： https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class _150_逆波兰表达式 {

    public static int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    numStack[index++] = Integer.parseInt(s);
                    break;
            }
        }
        return numStack[0];
    }
}
