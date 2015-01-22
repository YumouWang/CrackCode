package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode147 {
	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		ListNode result = new ListNode(0);
		ListNode start = result;
		List<ListNode> nodeList = new ArrayList<ListNode>();
		nodeList.add(head);
		head = head.next;
		while (head != null) {
			if (head.val < nodeList.get(0).val) {
				nodeList.add(0, head);
			} else if (head.val > nodeList.get(nodeList.size() - 1).val) {
				nodeList.add(nodeList.size(), head);
			} else {
				for (int i = 0; i < nodeList.size(); i++) {
					if (head.val <= nodeList.get(i).val) {
						nodeList.add(i, head);
						break;
					} else {
						continue;
					}
				}
			}				
			head = head.next;
		}
		
		for (int i = 0; i < nodeList.size(); i++) {
			result.next = nodeList.get(i);
			result = result.next;
		}
		result.next = null;
        return start.next;
    }
	
	public static void main (String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(10);
		ListNode node3 = new ListNode(3);		
		ListNode node4 = new ListNode(9);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(2);
		ListNode node7 = new ListNode(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		LeetCode147 r = new LeetCode147();
		ListNode start = r.insertionSortList(node1);
		while (start!= null) {
			System.out.print(start.val + "->");	
			start = start.next;
		}
	}

}
