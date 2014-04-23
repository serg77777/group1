package lesson140326.inner;

public class DogBrain {

	private interface BrainState {

		public void feed();

		public void pat();

	}

	class Fat implements BrainState {

		@Override
		public void feed() {

			mood++;
			System.out.println("Bark");
		}

		@Override
		public void pat() {

			System.out.println("Lash");
			mood--;
			if (mood <= 0) {
				state = hungry;
			}
		}
	}

	BrainState state;

	class Hungry implements BrainState {

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
			mood--;
			if (mood <= 0) {
				state = hungry;
			}
		}

		private final BrainState hungry = new Hungry();
		private final BrainState fat = new Fat();
		private BrainState state;
		private int mood = 0;

		public void feed() {

			state.feed();

		}

		public void pat() {

			state.pat();
		}
	}

}
