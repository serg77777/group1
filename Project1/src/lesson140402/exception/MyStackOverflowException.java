package lesson140402.exception;

public class MyStackOverflowException extends Exception {

	public MyStackOverflowException(String string) {
		super(string);
	}

	public MyStackOverflowException(String string, int tos, int length) {
		super(string+"\ntos = "+tos+"\nlength="+length);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3048015511164713752L;

}
