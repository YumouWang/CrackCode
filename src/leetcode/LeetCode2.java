package leetcode;

public class LeetCode2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode start = result;
        int carry = 0;
        
        while(l1 != null || l2 != null) {
        	int num1 = 0;
        	int num2 = 0;
        	if(l1 == null) {
        		num1 = 0;
        	} else {
        		num1 = l1.val;
        		l1 = l1.next;
        	}
        	
        	if(l2 == null) {
        		num2 = 0;
        	} else {
        		num2 = l2.val;
        		l2 = l2.next;
        	}
        	
        	
        	int value = (num1 + num2 + carry) % 10;
        	result.next = new ListNode(value);
        	carry = (num1 + num2 + carry) / 10;
        	result = result.next;
        }
        System.out.println(carry);
        if(carry == 1) {
        	result.next = new ListNode(1);
        }
        return start.next;
    }

	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(9);
		ListNode node3 = new ListNode(3);
		
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
//		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
//		node6.next = node7;
//		node7.next = null;
		LeetCode2 l = new LeetCode2();
		ListNode result = l.addTwoNumbers(node1, node4);
		System.out.println(result.val + "->" + result.next.val + "->" + result.next.next.val + "->" + result.next.next.next.val);
		
	}
}
