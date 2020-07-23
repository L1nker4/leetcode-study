package wang.l1n.leetcode.tree;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/6/1 17:13
 * @description： https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class _111_二叉树的最小深度 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int m1 = minDepth(root.left);
        int m2 = minDepth(root.right);

        if (root.left == null || root.right == null) {
            return m1 + m2 + 1;
        }
        return Math.min(m1, m2) + 1;
    }
}
