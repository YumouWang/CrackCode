package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode92 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
        	return null;
        }
        if (head.next == null) {
        	return head;
        }
        
        List<ListNode> nodeList = new ArrayList<ListNode>();
        ListNode temp1 = null;
        ListNode temp2 = null;
        ListNode result = new ListNode(0);
        ListNode start = result;
        while (head != null) {
        	nodeList.add(head);
        	head = head.next;
        }
        while (m < n) {
        	temp1 = new ListNode(nodeList.get(m - 1).val);
        	temp2 = new ListNode(nodeList.get(n - 1).val);
        	nodeList.remove(m - 1);
        	nodeList.add(m - 1, temp2);
        	nodeList.remove(n - 1);
        	nodeList.add(n - 1, temp1);
        	m = m + 1;
        	n = n - 1;
        }
        for (int i = 0; i < nodeList.size(); i++) {
        	result.next = nodeList.get(i);
        	result = result.next;
        }
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
		
		LeetCode92 r = new LeetCode92();
		ListNode start = r.reverseBetween(node1, 2, 4);
		while (start!= null) {
			System.out.print(start.val + "->");	
			start = start.next;
		}
		System.out.println();
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.get(0) + "," + l.get(1) + "," + l.get(2) + "," + l.size());
		l.remove(1);
		System.out.println(l.get(0) + "," + l.get(1) + "," + l.size());
		l.add(1, 2);
		l.add(1, 10);
		System.out.println(l.get(0) + "," + l.get(1) + "," + l.get(2) + "," + l.get(3) + "," + l.size());
	}
}
