package leetcode;

public class LeetCode82 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode start = result;
		ListNode current = head;        
		while(current != null) {
			int currentNumber = current.val;
			System.out.println(currentNumber + ",");
			if(current.next == null) {
				result.next = current;
				result = result.next;				
				current = current.next;
			} else {
				if(current.val != current.next.val) {
					result.next = current;
					result = result.next;		
					current = current.next;
				} else {
					while(current.val == currentNumber) {
						current = current.next;
						if(current == null) {
							break;
						}
					}
				}
			}			
		}
		result.next = null;
		return start.next;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = null;
		
		LeetCode82 l = new LeetCode82();
		ListNode start = l.deleteDuplicates(node1);
		System.out.println(start.val);
	}

}
