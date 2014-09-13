package Stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class SetofStacks {
	ArrayList<LinkedList<Integer>> setOfStacks = new ArrayList<LinkedList<Integer>>();
	private int capacity = 5;
	
	public boolean isCapacity(LinkedList<Integer> linkedList) {
		if(linkedList.size() < capacity) {
			return true;
		}
		return false;
	}
	public LinkedList<Integer> getLastStack() {
		if(setOfStacks.size() == 0) 
			return null;
		else
			return setOfStacks.get(setOfStacks.size() - 1);		
	}
	public void push(int value) {
		if(getLastStack() == null) {
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			setOfStacks.add(linkedList);
			}
		LinkedList<Integer> linkedList = getLastStack();
		if(isCapacity(linkedList)) {
			linkedList.addLast(value);
		}
		else {
			LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
			linkedList1.addLast(value);
			setOfStacks.add(linkedList1);
		}
	}
	public int pop() {
		LinkedList<Integer> linkedList = getLastStack();
		int value = linkedList.getLast();
		linkedList.removeLast();
		if(linkedList.isEmpty()) {
			setOfStacks.remove(setOfStacks.size() - 1);
		}
		return value;
		
	}
	public int peek() {
		LinkedList<Integer> linkedList = getLastStack();
		int value = linkedList.getLast();
		return value;
	}
	public void printSetofStacks() {
		int stacksNum = setOfStacks.size();
		for(int i = 0; i < stacksNum; i++) {
			for(int j = 0; j < setOfStacks.get(i).size() ; j++){
				System.out.print(setOfStacks.get(i).get(j) + "->");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		SetofStacks sos = new SetofStacks();
		int[] a = new int[12];
		for(int i = 0; i < 12; i++) {
			a[i] = i + 1;
			sos.push(a[i]);
		}
		sos.printSetofStacks();
		System.out.println(sos.peek());
		System.out.println(sos.pop());
		sos.printSetofStacks();
		System.out.println(sos.pop());
		sos.printSetofStacks();
		System.out.println(sos.pop());
		sos.printSetofStacks();
	}

}
