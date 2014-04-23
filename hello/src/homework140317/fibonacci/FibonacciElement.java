package homework140317.fibonacci;

public class FibonacciElement {

	private int index;
	private long value;
	
	public FibonacciElement() {
		index = 0;
		value = 0;
	}
	
	public FibonacciElement(int index, long value, int indexRequired, FibonacciElement previousFibonacciElement, boolean isVerbose) {
		this.index = index;
		this.value = value;
		
		if(isVerbose) {
			System.out.println("Элемент последовательности Фибоначчи №"+index+" = "+value);
		}
		
		if(this.index < indexRequired) {
			FibonacciElement nextFibonacciElement = new FibonacciElement(this.index+1, this.value+previousFibonacciElement.getValue(), indexRequired, this, isVerbose);
		} else if(this.index == indexRequired) {
			System.out.println("Искомый член последовательности Фибоначчи №" + index + " найден! Он равен " + value);
		}
	}

	public long getValue() {
		return value;
	}
	
}
