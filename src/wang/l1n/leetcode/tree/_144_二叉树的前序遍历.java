package wang.l1n.leetcode.tree;

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
        while (!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if (curr.right != null){
                stack.add(curr);
            }
            if (curr.left != null){
                stack.add(curr);
            }
        }
        return list;
    }
}
