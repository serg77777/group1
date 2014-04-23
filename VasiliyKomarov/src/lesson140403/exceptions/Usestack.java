package lesson140403.exceptions;

public class Usestack {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		stack.pop();
		
		stack.top();

		try {
			stack.push("one");
			stack.push("two");
			stack.push("three");
			stack.push("four");
		} catch (StackOverflow e) {
			System.out.println("Слишком маленький стэк");
		}
		
		
	}
	
}
