package 平衡二叉树;

/**
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 *
 * @author boyas
 * @create 2021/6/27 2:17
 */
public class _110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return false;
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
