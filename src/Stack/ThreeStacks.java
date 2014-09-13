package Stack;

public class ThreeStacks {
	int stackSize = 10;
	int[] stackPointer = {0,0,0};
	int[] buffer = new int[stackSize * 3];
	
	public void push(int stackNum, int value) {
		buffer[(stackNum - 1)*stackSize + stackPointer[stackNum - 1]] = value;
		stackPointer[stackNum - 1]++;
	}
	
	public int pop(int stackNum) {
		int popValue = buffer[(stackNum - 1)*stackSize + stackPointer[stackNum - 1] - 1];
		buffer[(stackNum - 1)*10 + stackPointer[stackNum - 1] - 1] = 0;
		stackPointer[stackNum - 1]--;
		return popValue;
	}
	
	public int peek(int stackNum) {
		return buffer[(stackNum - 1)*stackSize + stackPointer[stackNum - 1] - 1];
	}
	
	public void printStack(int stackNum) {
		for(int i = (stackNum - 1) * stackSize; i < (stackNum - 1) * stackSize + stackSize; i++) {
			System.out.print(buffer[i] + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ThreeStacks ts = new ThreeStacks();
		ts.push(1, 10);
		ts.push(2, 20);
		ts.push(3, 30);
		ts.push(1, 11);
		ts.push(2, 21);
		ts.push(3, 31);
		ts.printStack(1);
		ts.printStack(2);
		ts.printStack(3);
		System.out.println(ts.pop(1));
		ts.printStack(1);
		ts.printStack(2);
		ts.printStack(3);
		System.out.println(ts.peek(2));
		ts.printStack(1);
		ts.printStack(2);
		ts.printStack(3);
	}

}
