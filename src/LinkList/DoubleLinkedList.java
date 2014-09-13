package LinkList;
import LinkList.LinkNode;
public class DoubleLinkedList {
	public LinkNode head;
	int pos;
	
	public void LinkHead() {
		this.head = null;
	}
	
	
	public void addLinkHead(LinkNode node) {
		node.setNext(head);
		head = node;
	}
	public void addLinkHead(int value) {
		LinkNode node = new LinkNode();
		node.setData(value);
		node.setNext(head);
		head = node;
	}
	public void addLinkTail(LinkNode node) {
		
		if(this.head == null) {
			this.head = node;
		}
		LinkNode current = head;
		
		//current = this.head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		System.out.println(current.getData() + "111111111");
		current.setNext(node);	
	}
	public void displayList() {
		LinkNode current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		LinkNode node1 = new LinkNode();
		LinkNode end = new LinkNode();
		node1.setData(3241);
		end.setData(90);
		list.addLinkHead(node1);
		list.addLinkHead(19);
		list.addLinkTail(end);
		list.displayList();
		//System.out.println(end.getPrev().getData());
	}

}
