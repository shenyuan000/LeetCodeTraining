package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.RootPaneContainer;

public class _589_N叉树的前序遍历 {
	 List<Integer> list = new ArrayList<>();
	public List<Integer> preorder(Node root) {
       if (root == null) return list;
        preOrderMoreTree(root);
        return list;
        
    }
	
	private void preOrderMoreTree (Node root) {
		list.add(root.val);
		for (Node chilNode : root.children) {
			preOrderMoreTree(chilNode);
		}
	}
	
	
	//迭代 栈
	public List<Integer> preorder2(Node root) {
		List<Integer> list2 = new ArrayList<>();
	       if (root == null) return list2;
	     Stack<Node> stack = new Stack<>();
	     stack.push(root);
	     while (!stack.isEmpty()) {
	    	 Node tmpNode = stack.pop();
	    	 list2.add(tmpNode.val);
			int size = tmpNode.children.size();
			for (int i = size - 1; i >=0; i--) {
				stack.push(tmpNode.children.get(i));
			}
		}
	        
	     return list2;
	}
}
