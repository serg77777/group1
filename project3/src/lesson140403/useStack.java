package lesson140403;

public class useStack {
	public static void main(String[] args){
		Stack stack = new Stack(3);
		stack.top();
		stack.pop();
		
		
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
	}

}
