package leetcode;

public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) {
    		return head;
    	}
    	if (head.next == null) {
    		return head;
    	}
    	ListNode result = new ListNode(0);
    	ListNode start = result;
    	result.next = head;
    	result = result.next;
    	System.out.println(start.next.val);
    	while (head != null) {
    		if (head.next == null && head.val == result.val) {
    			result.next = null;
    			break;
    		}
    		if (head.next == null && head.val != result.val) {
    			break;
    		}
    		if (head.val == head.next.val) {
    			head = head.next;
    			continue;
    		}
    		result.next = head.next;
    		result = result.next;
    		head = head.next;
    	}
        return start.next;
    }
    
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);		
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		LeetCode83 l = new LeetCode83();
		ListNode start = l.deleteDuplicates(node1);
		while (start!= null) {
			System.out.print(start.val + "->");	
			start = start.next;
		}	
	}

}
