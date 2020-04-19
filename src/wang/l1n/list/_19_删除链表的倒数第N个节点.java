package wang.l1n.list;

import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/19 13:24
 * @description： https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class _19_删除链表的倒数第N个节点 {

    /**
     * 两趟扫描
     * 第一趟获取链表长度
     * 第二趟找到需要删除的节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode demo = new ListNode(0);
        demo.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = demo;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return demo.next;
    }

    /**
     * 双指针
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0){
            fast = fast.next;
        }
        //为了找到要删除的节点的前一个节点，所以此处让fast.next!=null
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow为倒数第n个节点的前一个节点。
        slow.next = slow.next.next;
        return res.next;

    }


}
