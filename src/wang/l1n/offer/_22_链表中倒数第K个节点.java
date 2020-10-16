package wang.l1n.offer;


/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/28 17:42
 * @description： https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class _22_链表中倒数第K个节点 {

    /**
     * 暴力：两趟扫描
     * 第一趟获取链表长度
     * 第二趟获取对应元素
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode demo = new ListNode(0);
        demo.next = head;
        int length = 0;
        ListNode first = head;
        //获取链表长度
        while (first != null) {
            length++;
            first = first.next;
        }
        first = head;
        for (int i = 0; i < length - k; i++) {
            first = first.next;
        }
        return first;
    }

    /**
     * 双指针
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd2(ListNode head, int k) {
        return null;
    }

}
