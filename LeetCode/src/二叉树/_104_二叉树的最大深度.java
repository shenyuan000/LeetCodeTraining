package 二叉树;

public class _104_二叉树的最大深度 {
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int leftMaxDepth = maxDepth(root.left);
		int rightMaxDepth = maxDepth(root.right);
		return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
}
