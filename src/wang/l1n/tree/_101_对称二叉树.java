package wang.l1n.tree;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 9:37
 * @description： https://leetcode-cn.com/problems/symmetric-tree/
 */
public class _101_对称二叉树 {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    /**
     * 递归
     * @param t1
     * @param t2
     * @return
     */
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right);
    }
}
