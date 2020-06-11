package 二叉树;

import java.util.ArrayList;
import java.util.List;
/**
 * 只要children为空，就把此节点插入到list里面；如果不为空，就使用poster递归下去
把当前节点的children处理完毕，就把当前节点的值插入到list里面，就构成了一次后序遍历了

链接：https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/solution/yong-di-gui-jie-jue-hou-xu-bian-li-by-shahuwang/
 * @author yysi
 *
 */

public class _590_N叉树的后序遍历 {

	List<Integer> list = new ArrayList<>();
	public List<Integer> postorder(Node root) {
		if (root == null) return list;
		for (Node childNode : root.children) {
			if (childNode.children == null || childNode.children.size() == 0) {
				list.add(childNode.val);
			} else {
				postorder(childNode);
			}
		}
		list.add(root.val);
		return list;
        
    }
}
