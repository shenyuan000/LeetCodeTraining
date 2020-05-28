package 链表;

public class _876_链表的中间结点 {
	/**
	 * 快慢指针
	 * @param head
	 * @return
	 */
	
	/*
	 * 获取中间元素的问题。设有两个指针 fast 和 slow，初始时指向头节点。
	 * \每次移动时，fast向后走两次，slow向后走一次，直到 fast 无法向后走两次。
	 * 这使得在每轮移动之后。fast 和 slow 的距离就会增加一。设链表有 n 个元素，
	 * 那么最多移动 n/2 轮。当 n 为奇数时，slow 恰好指向中间结点，
	 * 当 n 为 偶数时，slow 恰好指向中间两个结点的靠前一个
	 */
	public ListNode middleNode(ListNode head) {
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
}
