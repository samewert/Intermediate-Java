package PA1;

import java.util.Arrays;

public class Stack{
	
	private char[] stackArray;
	private int maxStackSize;
	private int topOfStack;
	
	public Stack(final int xArg) {
		topOfStack = -1;
		maxStackSize = xArg;
		stackArray = new char[xArg];
	}
	
	public final void push(final char val) {
		if(topOfStack == maxStackSize - 1) {
			System.out.println("Cannot push! Stack is full");
		}
		else {
			topOfStack++;
			stackArray[topOfStack] = val;
		}
	}
	
	public final char pop() {
		if(topOfStack == -1) {
			System.out.println("Cannot pop! Stack is empty");
			return '\0';
		}
		else {
			char y = stackArray[topOfStack];
			topOfStack--;
			return y;
		}
	}
	
	public final char peek() {
		if(topOfStack == -1) {
			System.out.println("Cannot peek! Stack is empty");
			return '\0';
		}
		else {
			return stackArray[topOfStack];
		}
	}
	
	public final int getSize() {
		return (topOfStack + 1);
	}
	
	public final String toString() {
		char[] toReturn = new char[topOfStack + 1];
		for(int i = 0; i <= topOfStack; i++) {
			toReturn[i] = stackArray[i];
		}
		return Arrays.toString(toReturn);
	}

		
	
}