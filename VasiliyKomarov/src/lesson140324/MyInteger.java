package lesson140324;

public class MyInteger extends Number {

	private int _initialValue;
	
	public MyInteger(int initialValue){
		_initialValue = initialValue;
	}
	
	@Override
	public double doubleValue() {
		
		return 0;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public int intValue() {
		return - _initialValue;
		
	}

	@Override
	public long longValue() {
		return 0;
	}

}
