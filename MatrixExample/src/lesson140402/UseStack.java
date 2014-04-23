package lesson140402;

public class UseStack {
	public static void main(String[] args) {
		Stack stack = new Stack(6);
		
		try {
			System.out.println(stack.top());
		} catch (StackIsEmptyException e1) {
			System.out.println("stack is empty");
		}
		
		try {
			stack.push(1);
		} catch (MyStackOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
		} catch (MyStackOverflowException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getClass().getSimpleName());
			e.printStackTrace();
		}
		
		try {
			System.out.println("Top element: " + stack.top());
		} catch (StackIsEmptyException e) {
			System.out.println("stack is empty");
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.pop();
	}
}
