package 链表;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 

示例:

给定 1->2->3->4, 你应该返回 2->1->4->3.

链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * @author yysi
 *
 */
public class _24_两两交换链表中的节点 {
	public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //第一个节点
        ListNode first = head;
        //第二个节点
        ListNode second = first.next;
        //第三个节点
        ListNode third = second.next;
        //交换第一 第二个节点的位置
        second.next = first;
        //之前的第一个节点指向递归返回的值
        first.next = swapPairs(third);
        //返回已经处理好后的链表
        return second;
    }
}
