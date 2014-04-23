package lesson140402.exceptions;

public class MyStackOverflowException extends Exception {

	private int _length;
	private int _tos;

	// add constructor with descr

	public MyStackOverflowException(int length, int tos) {

		_length = length;
		_tos = tos;
	}

}
