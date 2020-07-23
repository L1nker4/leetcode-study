package wang.l1n.leetcode.hash;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/11 16:37
 * @description： https://leetcode-cn.com/problems/design-hashmap/
 */
public class _706_设计哈希映射 {

    class Node {
        int key;
        int value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private int length = 100;
    private Node[] data = new Node[length];

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = key % length;
        if (data[index] == null) {
            Node node = new Node(key, value);
            data[index] = node;
            return;
        }
        //头节点不为空的时候，加在最后
        Node curr = data[index];
        while (true) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            if (curr.next == null) {
                Node node = new Node(key, value);
                node.prev = curr;
                curr.next = node;
                return;
            } else {
                curr = curr.next;
            }
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = key % length;
        Node curr = data[index];
        while (curr != null){
            if (curr.key == key){
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {

        int index = key % length;
        Node curr = data[index];
        if (curr != null && curr.key == key) {
            Node next = curr.next;
            if (next != null) {
                next.prev = null;
            }
            data[index] = next;
            return;
        }
        while (curr != null) {
            if (curr.key == key) {
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
}
