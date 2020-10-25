package wang.l1n.leetcode.bst;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/24 13:42
 * @description：
 */
public class _二叉搜索树的删除 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            //删除
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    public TreeNode getMin(TreeNode node){
        while (node.left!= null){
            node = node.left;
        }
        return node;
    }
}
