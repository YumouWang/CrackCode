package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode143 {
	public void reorderList(ListNode head) {
		if (head == null) {
			return;
		}
		List<ListNode> list = new ArrayList<ListNode>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).val);
		}

		// List<ListNode> result = list;
		ListNode result = new ListNode(0);
		if (list.size() % 2 == 1) {
			for (int i = 0; i < list.size() / 2; i++) {
				result.next = list.get(i);
				result = result.next;
				result.next = list.get(list.size() - 1 - i);
				result = result.next;
			}
			result.next = list.get(list.size() / 2);
			head = result.next;
		} else {
			for (int i = 0; i < list.size() / 2; i++) {
				result.next = list.get(i);
				result = result.next;
				result.next = list.get(list.size() - 1 - i);
				result = result.next;
			}
			head = result.next;
		}		
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

		LeetCode143 l = new LeetCode143();
		l.reorderList(node1);
		node2 = node1.next;
		node3 = node2.next;
		node4 = node3.next;
		node5 = node4.next;
		node6 = node5.next;
		node7 = node6.next;

		System.out.println(node1.val + "->" + node2.val + "->" + node3.val
				+ "->" + node4.val + "->" + node5.val + "->" + node6.val + "->"
				+ node7.val);

	}
}
