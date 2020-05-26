package 链表;
/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author yysi
 *
 */
public class _206_反转链表 {
	
	/**
	 * 迭代
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head) {
		// pre指针指向当前cur指针的前一个节点
		ListNode pre = null;
		// cur指针指向当前节点
		ListNode cur  = head;
		
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		
		return pre;
    }

	/**
	 * 递归
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode reListNode = reverseList(head.next);
		reListNode.next.next = head;
		reListNode.next = null;
		
		return reListNode;
    }
}
