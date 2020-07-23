package wang.l1n.leetcode.list;


/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/20 15:17
 * @description： https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class _21_合并两个有序链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode demo = new ListNode(0);
        ListNode node = new ListNode(0);
        demo.next = node;
        while(l1 != null && l2 != null){
            if (l1.val <= l2.val){
                node.next = l1;
                l1 = l1.next;
            }else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        /**
         * 执行到这里说明有一个链表遍历结束
         * 将未遍历完成的部分拼接在后面
         */
        if (l1 == null){
            node.next = l2;
        }
        if (l2 == null){
            node.next = l1;
        }
        return demo.next.next;
    }
}
