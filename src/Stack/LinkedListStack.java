package Stack;

import java.util.LinkedList;

public class LinkedListStack {
	private LinkedList<Integer> stack = new LinkedList();
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public void push(int value) {
		stack.addFirst(value);
	}
	public int peek() {
		return stack.getFirst();
	}
	public int pop() {
		int value = stack.getFirst();
		stack.removeFirst();
		return value;
	}
	public void printStack() {
		for(int i = 0; i < stack.size(); i ++) {
			System.out.print("<-" + stack.get(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedListStack lls = new LinkedListStack();
		lls.push(10);
		lls.push(20);
		lls.printStack();
		while(!lls.isEmpty()) {
			System.out.println(lls.pop());
		}
	}

}
