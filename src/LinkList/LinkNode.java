package LinkList;

public class LinkNode {
	private int data;
	private LinkNode prev;
	private LinkNode next;
	public void setData(int data){ 
		this.data = data;  
	}
	public int getData(){
		return this.data ;  
	}  
	public void setNext(LinkNode next){  
		this.next = next;
	}  
	public LinkNode getNext(){  
		return this.next;
	}  
}
