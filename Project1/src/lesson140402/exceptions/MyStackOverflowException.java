package lesson140402.exceptions;

public class MyStackOverflowException extends Exception {

	private int _length;
	private int _tos;
	
	public MyStackOverflowException(int length, int tos) {
		// TODO Auto-generated constructor stub
		_length = length;
		_tos = tos;
	}
	


}
