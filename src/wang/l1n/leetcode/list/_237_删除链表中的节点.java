package wang.l1n.leetcode.list;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/18 21:30
 * @description： https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class _237_删除链表中的节点 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
