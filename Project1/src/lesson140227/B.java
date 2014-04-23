package lesson140227;

public class B {
	
	
	int state;
//	int state = -1;
	
	
	{ //инициализатор
		System.out.println("created "+ this);
		System.out.println("my state is " + state);
	}
	
	B() {
		this(-1);
	}
	
	B(int state) {
		
		this.state = state;
		System.out.println("now my state is " + state);
	}
	
	public static void main(String[] args) {
		B b = new B();
		
		//B b2 = new B(20);
	}

}
