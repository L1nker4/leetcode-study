package wang.l1n.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/1 8:41
 * @description： 广度优先搜索
 */
public class BST {



    public Node bst(Node root , Node target){
        Queue<Node> queue = new LinkedList<>();
        int step = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            step += 1;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.peek();
                if (target.equals(curr)){
                    return curr;
                }
//                for ()
            }
        }
        return null;
    }

}
