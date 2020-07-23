package wang.l1n.leetcode.tree;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/30 10:03
 * @description： https://leetcode-cn.com/problems/path-sum/
 */
public class _112_路径总和 {


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null){
            return false;
        }

        sum -= root.val;
        if ((root.left == null) && (root.right == null)){
            return (sum == 0);
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
