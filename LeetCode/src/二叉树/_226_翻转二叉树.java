package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 * @author yysi
 *
 */

public class _226_翻转二叉树 {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return root;
		
		TreeNode tmpNode = root.left;
		root.left = root.right;
		root.right = tmpNode;
		
		invertTree(root.left);
		invertTree(root.right);
		
		
		return root;
    }
	
	
	public TreeNode invertTree2(TreeNode root) {
		if (root == null) return root;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			
			TreeNode tmpNode = node.left;
			node.left = node.right;
			node.right = tmpNode;
			
			if (node.left != null) {
				queue.offer(node.left);
			}
			
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		
		
		return root;
    }
}
