package wang.l1n.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/21 10:53
 * @description： https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 */
public class _104_二叉树的最大深度 {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            maxDepth++;
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return maxDepth;
    }
}
