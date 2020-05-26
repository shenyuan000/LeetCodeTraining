package 链表;
/**

https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/ 
* @author yysi
 *
 */
public class _83_删除排序链表中的重复元素 {

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode currentListNode  = head;
		while (currentListNode != null && currentListNode.next != null) {
			if (currentListNode.next.val == currentListNode.val) {
				currentListNode.next = currentListNode.next.next;
			} else {
				currentListNode = currentListNode.next;
			}
		}
		return head;
    }
	
	
	public static void main(String[] args) {
		int[] x = {1,2,3,3,5,6};
		ListNode list3ListNode  = ListNode.createLinkedList(x);
		ListNode list4ListNode = deleteDuplicates(list3ListNode);
		ListNode.printLinkedList(list4ListNode);
		
	}





	
}
