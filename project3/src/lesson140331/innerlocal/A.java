package lesson140331.innerlocal;

public class A implements I {

	public I getI(){
		return this;
	}
	
	@Override
	public void doIt() {
		System.out.println("I did it by myself");		
	}


	}
