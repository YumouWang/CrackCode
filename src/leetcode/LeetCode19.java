package leetcode;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
        	return null;
        }
        int i = 0;
        ListNode result = new ListNode(0);
        ListNode start = result;
        ListNode p1 = head;
        ListNode p2 = head;
        while (head != null) {
        	p1 = p1.next;       	
        	if (i >= n) {
        		result.next = p2;
        		System.out.println(p2.val);
        		result = result.next;
        		p2 = p2.next;
        	}
        	i ++;
        	head = head.next;
        }
        result.next = null;
        //System.out.println(p2.val);
        p2 = p2.next;
        while (p2 != null) {
        	result.next = p2;
    		result = result.next;
    		p2 = p2.next;
        }
        return start.next;
    }
    
    public static void main (String[] args) {
    	ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = null;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		LeetCode19 l = new LeetCode19();
		ListNode start = l.removeNthFromEnd(node1, 1);
		System.out.println(start.val + "->" + start.next.val);
    }

}
