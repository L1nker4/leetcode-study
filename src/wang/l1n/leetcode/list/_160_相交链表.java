package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/25 14:34
 * @description： https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class _160_相交链表 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pB;
    }
}
