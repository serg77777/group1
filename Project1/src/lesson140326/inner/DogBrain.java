package lesson140326.inner;

public class DogBrain {

	private interface BrainState {
		
		public void feed();
		public void pat();
		
	}

	private final BrainState hungry = createHungty();
	private final BrainState fat = createFat();

	private BrainState createHungty() {
		return new BrainState() {

			@Override
			public void feed() {
				mood += 2;
				System.out.println("Eat");
				if (mood > 0) {
					state = fat;
				}
			}

			@Override
			public void pat() {
				System.out.println("Bite");
				mood--;
			}
			
		};
	}

	private BrainState createFat() {
		return new BrainState() {
			@Override
			public void feed() {
				System.out.println("Bark");
				mood++;
			}

			@Override
			public void pat() {
				System.out.println("Lash");
				if (mood <= 0) {
					state = hungry;
				}
			}
		};
	}
	
	private BrainState state = hungry;
	private int mood = 0;
	
	public void feed() {
		state.feed();
	}
	public void pat() {
		state.pat();
	}
	
}
