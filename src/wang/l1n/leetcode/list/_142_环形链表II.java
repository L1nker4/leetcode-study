package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/24 22:35
 * @description： https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class _142_环形链表II {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
