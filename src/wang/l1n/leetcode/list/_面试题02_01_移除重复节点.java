package wang.l1n.leetcode.list;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/20 13:44
 * @description：
 */
public class _面试题02_01_移除重复节点 {

    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode demo = head;
        Set<Integer> set = new HashSet<>();
        ListNode prev = new ListNode(0);
        prev.next = demo;
        while (demo != null){
            if (!set.contains(demo.val)){
                set.add(demo.val);
                prev = prev.next;
                demo = demo.next;
            }else {
                prev.next = demo.next;
                demo = demo.next;
            }

        }
        return head;
    }
}
