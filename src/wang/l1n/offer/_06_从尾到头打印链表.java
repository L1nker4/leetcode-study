package wang.l1n.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/16 13:00
 * @description：
 */
public class _06_从尾到头打印链表 {

    ArrayList<Integer> tmp = new ArrayList<Integer>();

    public int[] reversePrint1(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }
    void recur(ListNode head) {
        if(head == null) {
            return;
        }
        recur(head.next);
        tmp.add(head.val);
    }

    public int[] reversePrint(ListNode head) {
        ListNode test = head;
        Stack<Integer> stack = new Stack<>();
        int len = 0;
        while (test != null){
            stack.push(test.val);
            test = test.next;
            len++;
        }
        int[] res = new int[len];
        int index = 0;
        while (!stack.isEmpty()){
            res[index++] = stack.pop();
        }
        return res;
    }
}
