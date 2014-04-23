package homework140317.fibonacci;

public class FibonacciSequence {

	public static void main(String[] args) {
		
		final int STARTING_INDEX = 1;
		final long STARTING_VALUE = 1;
				
		final int INDEX_OF_REQUIRED_FIBONACCI_MEMBER = 15;
		final boolean VERBOSITY_FLAG = true;
		
		FibonacciElement f = new FibonacciElement(STARTING_INDEX, STARTING_VALUE, INDEX_OF_REQUIRED_FIBONACCI_MEMBER, new FibonacciElement(), VERBOSITY_FLAG);
				

	}

}
