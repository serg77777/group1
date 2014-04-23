package homework140317.factorial;

public class FactorialCalculator {

	public static void main(String[] args) {

		final int STARTING_NUMBER = 1;
		final long STARTING_VALUE = 1;
				
		final int FACTORIAL_OF_NUMBER_REQUIRED = 19;
		final boolean VERBOSITY_FLAG = true;
		
		FactorialOfNumber f = new FactorialOfNumber(STARTING_NUMBER, FACTORIAL_OF_NUMBER_REQUIRED, new FactorialOfNumber(), VERBOSITY_FLAG);
		

	}

}
