package 二叉树;

public class _114_二叉树展开为链表 {

	public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;//左边为空，转到下一个节点
            } else {
                //获得右边子树的最右边节点
                TreeNode tmp = root.left;
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                //右边子树的的右节点指向原先的右子树
                tmp.right = root.right;
                //将左子树插到右子树的位置
                root.right = root.left;
                root.left = null;
                //继续下一个节点
                root = root.right;
            }
        }
    }
}
