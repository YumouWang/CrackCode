package leetcode;

public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
        	return null;
        }
        if (head.next == null) {
        	return head;
        }
        ListNode result = new ListNode(head.next.val);
        ListNode start = result;
        while (head != null) {
        	if (head.next == null) {
        		result.next = new ListNode(head.val);
        		break;
        	}
        	result.next = new ListNode(head.next.val);
        	result.next.next = new ListNode(head.val);
        	
        	System.out.println(result.val + "," + result.next.val);
        	//System.out.println(head.val + "," + head.next.val);
        	head = head.next.next;
        	result = result.next.next;
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
		
		LeetCode24 l = new LeetCode24();
		System.out.println(l.swapPairs(node1).val + "->" + l.swapPairs(node1).next.val + "->" + l.swapPairs(node1).next.next.val + "->");
    }

}
