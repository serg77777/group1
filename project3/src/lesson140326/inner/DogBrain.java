package lesson140326.inner;

public class DogBrain {

	private interface BrainState{
		public void feed();
		public void pat();
	}
	
	private final BrainState hungry = new BrainState(){
		
		@Override
		public void feed() {
			System.out.println("bark");
			mood++;
		}
		
		@Override
		public void pat() {
			System.out.println("lash");
			mood--;
			if (mood <=0){
				state=hungry;
			}
		}
	};
	
	private final BrainState fat = new BrainState(){
		
		@Override
		public void feed() {
			System.out.println("eat");
			mood+=2;
			if (mood>0){
				state = fat;
			}
		
		}
		@Override
		public void pat() {
			System.out.println("bite");
			mood--;
		}
	};
		
	BrainState state = hungry;
	int mood=0;
	
	public void feed(){
		state.feed();
	}
	
	public void pat(){
		state.pat();
	}
}
