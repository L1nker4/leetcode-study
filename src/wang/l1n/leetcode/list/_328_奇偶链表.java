package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/25 15:01
 * @description： https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class _328_奇偶链表 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
