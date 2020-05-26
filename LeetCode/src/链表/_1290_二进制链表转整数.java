package 链表;
/**
 * https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @author yysi
 *
 */

//1.假设有二进制数10101010，将其分为两部分1010101、0。
//2.假设1010101对应的十进制数是a，则10101010对应的十进制数是a*2+0.
//3.同理a也可这样计算得到 a=b*2+1;b是(101010)对应的十进制数
//4.所以有递推公式前面的 十进制数*2+最后一位二进制数
public class _1290_二进制链表转整数 {
	public static int getDecimalValue(ListNode head) {
		int decima = 0;
		while (head != null) {
			decima = decima << 1;
			decima = decima + head.val;
			head = head.next;
		}
		return decima;
	}
	
	public static void main(String[] args) {
		int[] x = {1,0,1,0,1};
		ListNode node1ListNode = ListNode.createLinkedList(x);
		int temp = getDecimalValue(node1ListNode);
		System.out.println(temp);
	}
	
}
