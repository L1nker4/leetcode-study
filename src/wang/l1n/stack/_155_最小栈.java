package wang.l1n.stack;

import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 19:55
 * @description： https://leetcode-cn.com/problems/min-stack/
 */
public class _155_最小栈 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public _155_最小栈() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()) {
            int top = minStack.peek();
            // 压入元素小于最小栈顶部元素才
            if (x <= top) {
                minStack.push(x);
            }
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();
        int top = minStack.peek();
        // 等于的时候再出栈
        if (pop == top) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
