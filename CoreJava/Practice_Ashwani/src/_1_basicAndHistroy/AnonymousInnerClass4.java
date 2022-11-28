package _1_basicAndHistroy;
class Vehicle4 {
	void start() {
		System.out.println("1");
	}
}

class AnonymousInnerClass4 {
	public static void main(String[] args) {
		Vehicle4 v = new Vehicle4() {
			public void start() {
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}