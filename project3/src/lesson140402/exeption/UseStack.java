package lesson140402.exeption;

public class UseStack {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		try {
			System.out.println(stack.top());
		} catch (StackIsEmptyExeption e1) {
			// TODO Auto-generated catch block
			System.out.println("stack is empty");
		}

		try {
			stack.push(1);
		} catch (MyStackOverflowExeption e) {
			System.out.println(e.getClass().getSimpleName());
		}
		try {
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
		} catch (Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}

		try {
			System.out.println("Top elem: " + stack.top());
		} catch (StackIsEmptyExeption e) {
			System.out.println("stack is empty");
		}

		while (!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackIsEmptyExeption e) {
				
			}
		}
		
		try {
			stack.pop();
		} catch (StackIsEmptyExeption e) {
			System.out.println("stack is empty");
		}
	}

}
