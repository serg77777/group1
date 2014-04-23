package lesson140324;

public class B extends A{

	@Override
	public void changeState(){
		super.changeState();
		state*=2;
	}
	public static void main(String[] args) {
		B b= new B();
		b.state = 3;
		b.changeState(1);
		System.out.println(b.state);
	}
	
}
