package lesson140407.exceptions;

public class ExeptionExample  {
	
	public static class MyExeption extends Exception {
		
	}
	public static class MyExeption2 extends MyExeption {
		
	}
	
	public static void main(String[] args) {
		try {
			doSameThing();
//		} catch (MyExeption2 e) {
//			System.out.println("MyExeption2");
//		} catch (MyExeption e) {
//			System.out.println("MyExeption");
		} catch (Exception e) {
			System.out.println("Exeption");
		}
	}

	private static void doSameThing() throws MyExeption2{
		try {
			
			doEnotherThing();
			System.out.println("!!MyExeption");
		} catch (MyExeption e) {
			System.out.println("!MyExeption");
		}
		finally {
			
			System.out.println("!!!");
		}
		//..
		throw new MyExeption2();
	}

	private static void doEnotherThing() throws MyExeption {
		throw new MyExeption();
		
	}

}
