package 链表;

public class _22_链表中倒数第k个节点 {
	/**
	 * 两次遍历
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode getKthFromEnd(ListNode head, int k) {
		int length = 0;
		ListNode pNode = head;
		//第一次遍历
		while (pNode != null) {
			length++;
			pNode = pNode.next;
		}
		ListNode qNode = head;
		//第二次遍历
		for (int i = 0; i < length - k; i++) {
			qNode = qNode.next;
		}
		return qNode;
		
    }
	
	/**
	 * 快慢指针
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode getKthFromEnd2(ListNode head, int k) {
		ListNode pListNode = head, qListNode = head;
		for (int i = 0; i < k; i++) {
			pListNode = pListNode.next;
		}
		
		while (pListNode != null) {
			qListNode = qListNode.next;
			pListNode = pListNode.next;
		}
		return qListNode;
    }
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6};
		ListNode list1Node  = ListNode.createLinkedList(x);
		ListNode listNode2 = getKthFromEnd2(list1Node, 3);
		
		ListNode.printLinkedList(listNode2);
		
	}
}
