package lesson140331.innerlocal;

public class A implements I{

	@Override
	public void aoIt() {
		
		System.out.println("did it");
		
	}

	
	public I getImplementerOfI() {
		return this;
	}
}
