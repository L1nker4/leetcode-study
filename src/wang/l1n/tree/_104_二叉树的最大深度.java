package wang.l1n.tree;

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
}
