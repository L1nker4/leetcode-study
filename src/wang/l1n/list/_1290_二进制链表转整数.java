package wang.l1n.list;


/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/17 19:54
 * @description： https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class _1290_二进制链表转整数 {

    /**
     * 利用短除法的逆向思维进行计算
     * @param head
     * @return
     */
    public static int getDecimalValue(ListNode head) {
        ListNode p = head;
        int res = 0;
        while(p != null){
            res = res * 2;
            res += p.val;
            p = p.next;
        }
        return res;
    }

    /**
     * 将链表遍历生成二进制字符串，并使用JDK的Integer自带的转换，
     * @param head
     * @return
     */
    public static int getDecimalValue1(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        Integer a = Integer.parseInt(sb.toString(),2);
        return a;
    }
}
