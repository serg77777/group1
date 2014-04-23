package lesson140227;

public class B {

	int state;
	// int state = -1;
	
	//инициализатор
	{
		System.out.println ("1created " + this);
		System.out.println ("2my state is  " + state);
	}
	
	B() { 
		this (-1);//B(-1)
	}
	B(int state) {
		this.state = state;
		System.out.println("3Now my state is " + this.state);
	}
	
	
	
	public static void main (String [] args) {
		//System.out.println("b:");
		B b = new B();
		//System.out.println("b2:");
		//B b2 = new B(20);
	}
}
