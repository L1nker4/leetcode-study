package wang.l1n.leetcode.list;

public class _83_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode demo = new ListNode(-1000);
        demo.next = head;
        ListNode test = demo.next;
        ListNode prev = demo;
        while(test != null){
            if(prev.val == test.val){
                remove(prev);
                test = test.next;
            }else{
                test = test.next;
                prev = prev.next;
            }
        }
        return demo.next;
    }

    public void remove(ListNode prev){
        prev.next = prev.next.next;
    }
}
