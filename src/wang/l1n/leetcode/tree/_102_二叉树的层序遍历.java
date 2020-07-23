package wang.l1n.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 14:31
 * @description： https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class _102_二叉树的层序遍历 {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> data = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.peek();
                queue.poll();
                if (curr == null){
                    continue;
                }
                level.add(curr.val);
                queue.offer(curr.left);
                queue.offer(curr.right);
            }
            if (!level.isEmpty()){
                data.add(level);
            }
        }
        return data;
    }
}
