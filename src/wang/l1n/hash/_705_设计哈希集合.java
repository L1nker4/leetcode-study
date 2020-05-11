package wang.l1n.hash;

import org.w3c.dom.Node;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/11 15:30
 * @description： https://leetcode-cn.com/problems/design-hashset/
 */
public class _705_设计哈希集合 {

    class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    private int length = 100;
    private Node[] data = new Node[length];

    public void add(int key) {
        int index = key % length;
        if (data[index] == null) {
            Node node = new Node(key);
            data[index] = node;
            return;
        }
        //头节点不为空的时候，加在最后
        Node curr = data[index];
        while (true) {
            if (curr.val == key) {
                return;
            }
            if (curr.next == null) {
                Node node = new Node(key);
                node.prev = curr;
                curr.next = node;
                return;
            } else {
                curr = curr.next;
            }
        }
    }

    public void remove(int key) {
        int index = key % length;
        Node curr = data[index];
        if (curr != null && curr.val == key) {
            Node next = curr.next;
            if (next != null) {
                next.prev = null;
            }
            data[index] = next;
            return;
        }
        while (curr != null) {
            if (curr.val == key) {
                Node next = curr.next;
                Node prev = curr.prev;
                if (next != null) {
                    next.prev = prev;
                }
                if (prev != null) {
                    prev.next = next;
                }
                return;
            }
            curr = curr.next;
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int index = key % length;
        Node curr = data[index];
        while (curr != null){
            if (curr.val == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
