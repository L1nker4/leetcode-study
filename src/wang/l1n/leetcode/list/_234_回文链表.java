package wang.l1n.leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/20 15:29
 * @description： https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class _234_回文链表 {

    /**
     * 一趟遍历放入list
     * 时间 O(n)
     * 空间 O(n)
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }




}
