package wang.l1n.leetcode.bst;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/24 13:33
 * @description：
 */
public class _700_二叉搜索树中的搜索 {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
