package 链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5

 * @author yysi
 *
 */

public class _203_移除链表元素 {

	/**
	 * 方法一（删除头结点时另做考虑）
	 * @param head
	 * @param val
	 * @return
	 */
	public static ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		if (head == null) return head;
		ListNode prevNode = head;
		while (prevNode.next != null) {
			if (prevNode.next.val == val) {
				prevNode.next = prevNode.next.next;
			} else {
				prevNode = prevNode.next;
			}
		}
		return head;
    }
	
	
	public static ListNode removeElements2(ListNode head, int val) {
		ListNode virtualNode = new ListNode(0);
		virtualNode.next = head;
		ListNode prevNode = virtualNode;
		while (prevNode.next != null) {
			if (prevNode.next.val == val) {
				prevNode.next = prevNode.next.next;
			} else {
				prevNode = prevNode.next;
			}
		}
		
		return virtualNode.next;
    }
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6};
		ListNode list1Node  = ListNode.createLinkedList(x);
		ListNode listNode2 = removeElements2(list1Node, 2);
		
		ListNode.printLinkedList(listNode2);
		
	}
}
