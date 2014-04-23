package homework140317.factorial;


public class FactorialOfNumber {

		private int number;
		private long value;
		
		public FactorialOfNumber() {
			number = 1;
			value = 1;
		}
		
		public FactorialOfNumber(int number, int calculatedFactorialNumber, FactorialOfNumber previousProduct, boolean isVerbose) {
			this.number = number;
			this.value = previousProduct.getValue()*this.number;
			
			if(isVerbose) {
				System.out.println(number+"! = "+value);
			}
			
			if(this.number < calculatedFactorialNumber) {
				FactorialOfNumber nextProduct = new FactorialOfNumber(this.number+1, calculatedFactorialNumber, this, isVerbose);
			} else if(this.number == calculatedFactorialNumber) {
				System.out.println("Искомый факториал числа " + number + " найден. "+number+"! = " + value);
			}
		}

		public long getValue() {
			return value;
		}
		
	
}
