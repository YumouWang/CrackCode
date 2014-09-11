package CrackCode;

public class Node {
	Node next = null;
	int data;
	public Node(int d) {
		data = d;
	}
	public void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	public static void main(String args[]) {
		Node node = new Node(10);
		node.appendToTail(1999);
		System.out.println(node.data + " " + node.next.data);
	}
}
