package wang.l1n.leetcode.tree;

import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/5 21:24
 * @description： https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class _98_验证二叉搜索树 {


    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val) {
            return false;
        }
        if (max != null && root.val >= max.val) {
            return false;
        }
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }

    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = -Double.MAX_VALUE;
        TreeNode curr = root;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }


}
