package glfsd.DSALabSolution.BracketChecker;

public class BracketsTest {
	public static void main (String[] args) {
		test("{[()]}");
		test("{}");
		}
private static void test (String brackets) {
	BalancedBracketChecker checker = new BalancedBracketChecker(brackets);
	boolean result = checker.check();
	if (result) {
		System.out.println("Bracket expression "+ brackets+ " is balanced");
	}else {
		System.out.println("Bracket expression "+ brackets+ " is balanced");
	}
	}
}

