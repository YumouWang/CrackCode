package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null && l2 == null) {
    		return null;
    	}
    	if (l1 != null && l2 == null) {
    		return l1;
    	}
    	if (l1 == null && l2 != null) {
    		return l2;
    	}
    	ListNode result = new ListNode(0);
    	ListNode start = result;
    	
        List<ListNode> list = new ArrayList<ListNode>();
        while (l1 != null && l2 != null) {
        	if (l1.val < l2.val) {
        		list.add(l1);
        		l1 = l1.next;
        	} else {
        		list.add(l2);
        		l2 = l2.next;
        	}
        }
        while (l1 != null) {
        	list.add(l1);
    		l1 = l1.next;
        }
        while (l2 != null) {
        	list.add(l2);
    		l2 = l2.next;
        }
        for (int i = 0; i < list.size(); i++) {
        	result.next = list.get(i);
        	result = result.next;
        }
        return start.next;       
    }
    
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
    
    public static void main(String[] args) {
    	ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		ListNode node5 = new ListNode(9);
		ListNode node6 = new ListNode(11);
		ListNode node7 = new ListNode(13);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		ListNode node8 = new ListNode(2);
		ListNode node9 = new ListNode(4);
		ListNode node10 = new ListNode(6);
		ListNode node11 = new ListNode(8);
		ListNode node12 = new ListNode(12);
		ListNode node13 = new ListNode(14);
		ListNode node14 = new ListNode(100);
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		node11.next = node12;
		node12.next = node13;
		node13.next = node14;
		node14.next = null;
		
		LeetCode21 l = new LeetCode21();
		ListNode start = l.mergeTwoLists(node1, node8);
		while (start != null) {
			System.out.print(start.val + "->");
			start = start.next;
		}
    }

}
