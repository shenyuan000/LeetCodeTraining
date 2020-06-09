package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7
返回它的最大深度 3 。

https://leetcode-cn.com/problems/maximum-depth-of-binary-tree

 * @author yysi
 *
 */

public class _104_二叉树的最大深度 {
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		int leftMaxDepth = maxDepth(root.left);
		int rightMaxDepth = maxDepth(root.right);
		return Math.max(leftMaxDepth, rightMaxDepth) + 1;
    }
	
	//层数
	public int maxDepth2(TreeNode root) {
		if (root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		int maxLevel = 0;
		queue.offer(root);
		while (!queue.isEmpty()) {
			maxLevel++;
			int sizeQ = queue.size();
			for (int i = 0; i < sizeQ; i++) {
				TreeNode tmpNode = queue.poll();
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}
				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
			}
			
			
		}
		return maxLevel;
    }
}
