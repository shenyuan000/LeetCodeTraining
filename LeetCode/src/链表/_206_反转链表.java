package 链表;
/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author yysi
 *
 */
public class _206_反转链表 {
	
	public ListNode reverseList2(ListNode head) {
		ListNode pre = null;
		
		ListNode cur  = head;
		
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}

		
		return pre;
    }

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
