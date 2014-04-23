package lesson140402.exception;

public class UseStack {

	public static void main(String[] args)  {

		Stack stack = new Stack(5);

		try {
			System.out.println("Top element: " + stack.top());
		} catch (StackIsEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
		} catch (MyStackOverflowException e) {
			System.err.println("Azzkiy sotona \n" + e.getLocalizedMessage());
			e.printStackTrace();
		}
		try {
			System.out.println("Top element: " + stack.top());
		} catch (StackIsEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			while (!stack.isEmpty()) {
				System.out.println(stack.pop());
			}
			stack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
