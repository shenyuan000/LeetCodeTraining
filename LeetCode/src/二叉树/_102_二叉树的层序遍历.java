package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @author yysi
 *
 */
public class _102_二叉树的层序遍历 {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) return new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			//获取队列的长度 这一层的节点个数
			int countSize = queue.size();
			List<Integer> resIntegers = new ArrayList<>();
			//将这一层的节点拿出来，放到临时的list里
			while (countSize > 0) {
				TreeNode tmpNode = queue.poll();
				resIntegers.add(tmpNode.val);
				if (tmpNode.left != null) {
					queue.offer(tmpNode.left);
				}

				if (tmpNode.right != null) {
					queue.offer(tmpNode.right);
				}
				
				countSize --;
			}
			list.add(resIntegers);		
		}

		return list;
	}
	
	
	
	public List<List<Integer>> levelOrder2(TreeNode root) {
	    if(root == null)
	        return new ArrayList<>();
	    List<List<Integer>> res = new ArrayList<>();
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        int count = queue.size();
	        List<Integer> list = new ArrayList<Integer>();
	        while(count > 0){
	            TreeNode node = queue.poll();
	            list.add(node.val);
	            if(node.left != null)
	                queue.add(node.left);
	            if(node.right != null)
	                queue.add(node.right);
	            count--;
	        }
	        res.add(list);
	    }
	    return res;
	}
}
