package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
        	return null;
        }
        if (head.next == null) {
        	return new TreeNode(head.val);
        }
        List<ListNode> nodeList = new ArrayList<ListNode>();
        while (head != null) {
        	nodeList.add(head);
        	head = head.next;
        }
        return doSortedListToBST(nodeList, 0, nodeList.size() - 1);
    }
    
    public TreeNode doSortedListToBST(List<ListNode> nodeList, int start, int end) {
    	if (start > end) {
    		return null;
    	}
    	if (start == end) {
    		return new TreeNode(nodeList.get(start).val);
    	}
    	int mid = (start + end) / 2;
    	TreeNode root = new TreeNode(nodeList.get(mid).val);
    	root.left = doSortedListToBST(nodeList, start, mid - 1);
    	root.right = doSortedListToBST(nodeList, mid + 1, end);
    	return root;
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
		
		LeetCode109 r = new LeetCode109();
		TreeNode root = r.sortedListToBST(node1);
		System.out.println(root.val);
		System.out.println(root.left.val + "," + root.right.val);
		System.out.println(root.left.left.val + "," + root.left.right.val);
		System.out.println(root.right.left.val + "," + root.right.right.val);
	}

}
