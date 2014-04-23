package lesson140324;

public class MyInteger extends Number {

	private final int _initValue;
	
	public MyInteger(int i) {
		_initValue = i;
	}
	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return -_initValue;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("" + intValue());
	}

}
