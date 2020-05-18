package wang.l1n.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/18 21:18
 * @description： https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class _144_二叉树的前序遍历 {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();

        if(root == null){
            return list;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }
}
