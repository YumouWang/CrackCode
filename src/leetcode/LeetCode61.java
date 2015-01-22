package leetcode;

public class LeetCode61 {

	public ListNode rotateRight(ListNode head, int n) {
		if(head == null || n == 0) {
			return head;
		}
			
		ListNode current = head;
		ListNode end = head;
		
        ListNode start = new ListNode(0);
        
        int length = 1;
        while(end.next != null) {
        	end = end.next;
        	length ++;
        }
        
        if(n % length == 0) {
			return head;
		}
        
        
        int offSet = length - n % length;
        while(offSet > 1) {
        	current = current.next;
        	offSet --;
        }
        
        end.next = head;
        start.next = current.next;
        current.next = null;
          
        return start.next;
    }
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		LeetCode61 l = new LeetCode61();
		ListNode start = l.rotateRight(node1, 2);
		System.out.println(start.val + "->" + start.next.val + "->" + start.next.next.val + 
				"->" + start.next.next.next.val + "->" + start.next.next.next.next.val);
		System.out.println();
		
	}

}
