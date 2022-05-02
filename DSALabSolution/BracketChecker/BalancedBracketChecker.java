package glfsd.DSALabSolution.BracketChecker;
import java.util.Set;
import java.util.Stack;
public class BalancedBracketChecker {
	private String brackets;
	public BalancedBracketChecker(String brackets) {
		this.brackets = brackets;
	}
	public boolean check() {
		if (brackets.length()%2!=0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		Set<Character> openBracketSet = BracketsManager.getOpenBrackets();
		Set<Character> closeBracketSet= BracketsManager.getCloseBrackets();
		for (int index=0;index <brackets.length();index++) {
			char aChar = brackets.charAt(index);
			if(openBracketSet.contains(aChar)) {
				stack.push(aChar);
			}else if (closeBracketSet.contains(aChar)) {
				char closedChar = aChar;
				Character openCharFromStack = stack.pop();
				Bracket bracketobj = BracketsManager.getBracket(closedChar);
				if  (openCharFromStack.equals(bracketobj.getOpenBracket())) {
					continue;
				}
			}else {
				System.out.println("invalid Character encountered"+"during Taversal.."+ aChar);
				return false;
				
			}
			
		}
		return stack.isEmpty();
	}

}
