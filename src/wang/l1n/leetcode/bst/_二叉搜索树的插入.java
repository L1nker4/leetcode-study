package wang.l1n.leetcode.bst;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/24 13:39
 * @description：  https://leetcode-cn.com/leetbook/read/introduction-to-data-structure-binary-search-tree/xp4tij/
 */
public class _二叉搜索树的插入 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
