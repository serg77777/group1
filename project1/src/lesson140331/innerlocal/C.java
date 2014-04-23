package lesson140331.innerlocal;


public class C {
public static class StaticInnerImplementorOfI(){
	
	@Override
	public void doIt(){
		System.out.println("I did it from C ");
	}
}
public I getImplementorOfI(){
	return new StaticInnerImplementorOfI();
}
}
