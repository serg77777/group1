package lesson140326.inner;

public class DogBrain {

	private interface BrainState {

		public void feed();

		public void pat();
	}

	private final BrainState hungry = createHungryState();
	private final BrainState fat = createFullState();

	private BrainState createHungryState() {

		return new BrainState() {

			@Override
			public void feed() {

				System.out.println("Eat");
				mood += 2;
				if (mood > 0) {
					state = fat;
				}
			}

			@Override
			public void pat() {

				System.out.println("Bite");
				mood -= 2;
			}

		};
	}

	private BrainState createFullState() {

		return new BrainState() {

			@Override
			public void feed() {

				System.out.println("Bark!");
				mood++;
			}

			@Override
			public void pat() {

				System.out.println("Wag");
				mood--;
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
