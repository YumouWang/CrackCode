package leetcode;

public class LeetCode86 {
	public ListNode partition(ListNode head, int x) {
		if(head == null) {
			return null;
		}
		ListNode current = head;
        
        ListNode start1 = new ListNode(0);
        ListNode start2 = new ListNode(0);
        ListNode list1 = start1;
        ListNode list2 = start2;
        
        while(current != null) {
        	if(current.val < x) {
        		list1.next = new ListNode(current.val);
        		System.out.println(list1.next.val);
        		list1 = list1.next;
        		
        	} else {
        		list2.next = new ListNode(current.val);
        		System.out.println(list2.next.val + "--");
        		list2 = list2.next;     		
        	}
        	current = current.next;
        }
        list2.next = null;
        list1.next = start2.next;
        ListNode result = start1.next;
        return result;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(2);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(2);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = null;
		
		ListNode head = new ListNode(1);
		
		LeetCode86 l = new LeetCode86();
		ListNode start = l.partition(node1, 3);
		System.out.println(start.val + "->" + start.next.val + "->" + start.next.next.val + "->" +
				start.next.next.next.val + "->" + start.next.next.next.next.val + "->");		
	}

}
