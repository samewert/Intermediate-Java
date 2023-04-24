package PA1;

//import PA1.Stack;

class Test {

	private static void testStack() {
		Stack stack = new Stack(4);
		for (int i = 1; i <= 2; i++) {
			System.out.println("Stack before push: " + stack + "; Size = " + stack.getSize());
			char m = (char) ('A' + i * 7);
			System.out.println("Push " + m);
			stack.push(m);
			System.out.println("Stack after push: " + stack + "; Size = " + stack.getSize());
			System.out.println("***");
		}
		for (int i = 1; i <= 2; i++) {
			System.out.println("Stack before pop: " + stack + "; Size = " + stack.getSize());
			System.out.println("Popped " + stack.pop());

			System.out.println("Stack after pop: " + stack + "; Size = " + stack.getSize());
			System.out.println("***");
		}
		for (int i = 0; i <= 3; i++) {
			System.out.println("Stack before push: " + stack + "; Size = " + stack.getSize());
			char m = (char) ('A' + i * 7);
			System.out.println("Push " + m);
			stack.push(m);
			System.out.println("Stack after push: " + stack + "; Size = " + stack.getSize());
			System.out.println("***");
		}

		System.out.println("Stack before peek: " + stack + "; Size = " + stack.getSize());

		System.out.println("Peeked " + stack.peek());

		System.out.println("Stack after peek: " + stack + "; Size = " + stack.getSize());
		System.out.println("***");
		stack.push((char) 67);
		System.out.println("\n***");
		for (int i = 1; i <= 4; i++)
			System.out.println("Popped " + stack.pop());
		System.out.println("***");
		stack.pop();
	}

	private static void testBP() {
		char str0[] = { '(', 'f', ')', 'x', '{', '}', 'a' };
		testBalancedHelper(str0);
		char str1[] = { '(', '(', 'y', '(', 'r', ')', '{', '}', ')', ')', ';' };
		testBalancedHelper(str1);
		char str2[] = { '{', '{', ')', '}' };
		testBalancedHelper(str2);
		char str3[] = { '{', '{', '}', '5', '\'', '}', '(', '+', ')', '(' };
		testBalancedHelper(str3);
		char str4[] = { '{', '}', '(', ')', '(', '}' };
		testBalancedHelper(str4);
		char str5[] = { '}', '}', '{', '{' };
		testBalancedHelper(str5);
	}

	private static void testBalancedHelper(char[] str) {
		BalancedParenthesis bp = new BalancedParenthesis(str);
		if (bp.isBalanced())
			System.out.println(bp + " is balanced.");
		else
			System.out.println(bp + " is not balanced.");
	}

	public static void main(String[] args) {
		System.out.println("********* Stack Verification *********\n");
		testStack();
		System.out.println("\n\n********* Balanced Parenthesis Verification *********\n");
		testBP();
	}
}
