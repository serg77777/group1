package lesson140326.inner;

public class DogBrain {

	private interface BrainState {
		public void feed();
		public void pat();
	}
	//sostoyanie sobaki 
//	private class Fat implements BrainState() { 
//		@Override
//		public void feed() {
//			System.out.println("Bark");
//			mood++;
//		}
//		@Override
//		public void pat() {
//			System.out.println("Lash");
//			mood--;
//			if (mood <= 0) {
//				state = hungry;
//			}
//		}
//	}
	//sostoyanie sobaki
//	private class Hungry implements BrainState { 
//		@Override
//		public void feed() {
//			System.out.println("Eat");
//			mood += 2;
//			if (mood > 0) {
//				state = fat;
//			}
//		}
//		@Override
//		public void pat() {
//			System.out.println("Bite");
//			mood--;
//		}
//	}
	
	private final BrainState hungry = new BrainState() { 
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
		}
	};
	private final BrainState fat = createFatState();
	private BrainState createFatState() {
		return new BrainState() { 
			@Override
			public void feed() {
				System.out.println("Bark");
				mood++;
			}
			@Override
			public void pat() {
				System.out.println("Lash");
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
