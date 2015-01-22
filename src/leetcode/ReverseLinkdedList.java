package leetcode;

import java.util.Stack;

public class ReverseLinkdedList {
	public ListNode reverseLinkedList(ListNode head) {
		ListNode result = new ListNode(0);
		ListNode start = result;
		Stack<ListNode> stack = new Stack<ListNode>();
		while (head!= null) {
			stack.push(head);
			head = head.next;
		}
		while (!stack.empty()) {
			result.next = stack.pop();
			result = result.next;
		}
		result.next = null;
		return start.next;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);		
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		ReverseLinkdedList r = new ReverseLinkdedList();
		ListNode start = r.reverseLinkedList(node1);
		while (start!= null) {
			System.out.print(start.val + "->");	
			start = start.next;
		}	
	}
}
