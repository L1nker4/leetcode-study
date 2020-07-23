package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/26 18:50
 * @description： https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class _24_两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode current = sentinel;

        while (current.next != null && current.next.next != null) {
            ListNode nodeA = current.next;
            ListNode nodeB = current.next.next;

            current.next = nodeB;
            nodeA.next = nodeB.next;
            nodeB.next = nodeA;
            current = current.next.next;
        }
        return sentinel.next;
    }
}
