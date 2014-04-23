package lesson140327.inner;

public class S {

	private static int counter;
	private static int getCounter(){
		return counter;
	}
	public static class Si {
		
		public void print (){
			System.out.println("static inner, counter =" + S.getCounter());
			//System.out.println(state); ERROR
		}
	}
	
	int state;
	private Si si;
	
	public S() {
		
		si = new Si();
	}
	public int getState () {
		return state;
	}
	public void print(){
		si.print();
	}
}
