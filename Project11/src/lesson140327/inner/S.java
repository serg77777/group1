package lesson140327.inner;

public class S {
	
	private static int counter;
	private static int getCounter(){
		return counter;
	}
	
	private static class Si{
		
		
		public void print(){
			System.out.println("print static inner, counter =" +S.getCounter());
//			System.out.println(state); error
		}
		
		
	}
	private int state;
	private Si si;
	
	public S(){
		counter++;
		si = new Si();
	}
	
	
	
 
 public int getState(){
	 return state;
 }
 
 public void print(){
	 si.print();
 }
 
 
 
}
