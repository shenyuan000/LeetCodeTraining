package 链表;
/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * @author yysi
 *
 */
public class _141_环形链表 {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowListNode = head;
        ListNode fastListNode = head.next;
        while (fastListNode != null && fastListNode.next != null) {
        	if (slowListNode == fastListNode) return true;
			slowListNode = slowListNode.next;
			fastListNode = fastListNode.next.next;
			
		}
        return false;
    }
    
}
