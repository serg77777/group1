package lesson140402.exeption;

public class MyStackOverflowExeption extends Exception {

	public int _lenght;
	public int _tos;
	public MyStackOverflowExeption(int length, int tos) {
		_lenght = length;
		_tos = tos;
	}
	
	

}
