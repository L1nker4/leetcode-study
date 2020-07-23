package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/25 14:52
 * @description： https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class _203_移除链表元素 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode prev = demo;
        while(curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            }else {
                prev = curr;
            }
            curr = curr.next;
        }
        return demo.next;
    }
}
