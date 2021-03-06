package wang.l1n.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 13:53
 * @description： https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class _94_中序遍历二叉树 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> data = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            data.add(curr.val);
            curr = curr.right;
        }
        return data;
    }
}
