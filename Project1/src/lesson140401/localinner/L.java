package lesson140401.localinner;

public class L {

		
		
		interface Changer {
			void changeState();
		}
		
		int state;
		
		public Changer getChanger(final int changeAmount) {
			class MyChanger implements Changer {
				
				int amount;
				
				MyChanger(int amount){
					this.amount = amount;
				}
				
				public void changeState(){
					state += changeAmount;
				}
			}
			
			return new MyChanger(changeAmount);
		}
		
		public Changer getAnonymChanger() {
			
			final int amount =90; 
			
			return new Changer() {
				
				int changeAmount;
				{
					changeAmount = amount;
				}
				
				public void changeState(){
					state +=10;
				}
			};
			
		}
		
		public static void main(String[] args) {
			L l = new L();
			Changer changer =l.getChanger(30);
			changer.changeState();
			System.out.println(l.state);
			
			l.getAnonymChanger().changeState();
			System.out.println(l.state);
		}
}
