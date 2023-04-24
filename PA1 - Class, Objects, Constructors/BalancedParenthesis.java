package PA1;

public class BalancedParenthesis {

	private char[] expression;

	public BalancedParenthesis(char[] expression) { // complete the constructor
		this.expression = expression;
	}

	public boolean isBalanced() { // complete this method
		Stack charList = new Stack(this.expression.length);
		for(int i = 0; i < this.expression.length; i++) {
			char c = this.expression[i];
			if((c == '{') || (c == '(')) {
				charList.push(c);
			}
			else if(c == '}' || c == ')') {
				if(charList.toString().equals("[]")) {
					return false;
				}
				else {
					char popped = charList.pop();
					if((popped == '{' && c == ')') || (popped == '(' && c == '}')) {
						return false;
					}
				}
			}	
		}
		
		if(charList.toString().equals("[]")) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString() { // complete this method
		return String.valueOf(this.expression);
	}
}
