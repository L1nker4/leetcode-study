package wang.l1n.leetcode.stack;

import java.util.Stack;
/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 20:10
 * @description： https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class _232_用栈实现队列 {
	
	private Stack<Integer> inStack = new Stack<>();
	private Stack<Integer> outStack = new Stack<>();
    
    /** 入队 */
    public void push(int x) {
        inStack.push(x);
    }
    
    /** 出队 */
    public int pop() {
        checkOutStack();
        return outStack.pop();
    }
    
    /** 获取队头元素 */
    public int peek() {
    	checkOutStack();
    	return outStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    private void checkOutStack() {
    	if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
    }

}
