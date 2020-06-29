package wang.l1n.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/20 14:10
 * @description： https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */
public class _145_二叉树的后序遍历 {

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null){
            return null;
        }
        List<Integer> data = new ArrayList<>();
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(curr);
        while (!stack.isEmpty()){
            TreeNode demo = stack.pop();
            if (demo.left != null && demo.left != curr && demo.right != curr){
                stack.push(demo.left);
            }else if (demo.right != null && demo.right != curr){
                stack.push(demo.right);
            }else {
                data.add(stack.pop().val);
                curr = demo;
            }
        }
        return data;
    }
}
