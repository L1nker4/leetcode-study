package wang.l1n.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/8 18:19
 * @description： https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class _225_用队列实现栈 {

    Queue<Integer> queue = new LinkedList<>();

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size > 1) {
            queue.add(queue.remove());
            size--;
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
