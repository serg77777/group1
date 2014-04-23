package lesson140326.inner;

public class DogBrain {

	private interface BrainState {
		public void feed();
		
		public void pat();
	}
	

	private final BrainState hungry = new BrainState() {

		@Override
		public void feed() {
			mood += 2;
			if(mood > 0){
				state = fat;
			}
			System.out.println("Eat");
			
		}

		@Override
		public void pat() {
			mood--;
			System.out.println("Bite");			
		}
		
	};
	private final BrainState fat = createFatState();

	private BrainState createFatState() {
		return new BrainState() {

			@Override
			public void feed() {
				mood++;
				System.out.println("Bark");
				
			}

			@Override
			public void pat() {
				mood--;
				System.out.println("Lash");
				if(mood <= 0){
					state = hungry;
				}
			}
			
		};
	}
	
	private BrainState state = hungry;
	private int mood = 0;
	
	public void feed(){
		state.feed();
	}
	
	public void pat(){
		state.pat();
	}
	
	public void lookAt(){
		System.out.println(state);
	}
	
}
