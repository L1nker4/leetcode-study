package wang.l1n.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/27 11:47
 * @description： https://leetcode-cn.com/problems/rotate-list/
 */
public class _61_旋转链表 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode old_tail = head;
        int n;
        for(n = 1; old_tail.next != null; n++) {
            old_tail = old_tail.next;
        }
        old_tail.next = head;
        ListNode new_tail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            new_tail = new_tail.next;
        }
        ListNode new_head = new_tail.next;
        new_tail.next = null;

        return new_head;
    }
}
