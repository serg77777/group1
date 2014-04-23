package lesson140402.exceptions;

public class MyStackOverflowException extends Exception {
	private int _length;
	private int _tos;

	public MyStackOverflowException(int length, int tos) {
		_length = length - 1;
		_tos = tos + 1;
	}

	@Override
	public String getMessage() {
		return "Tried to create at: " + _tos + " while max size is: " + _length;

	}
}
