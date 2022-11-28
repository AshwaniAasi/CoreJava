package _1_basicAndHistroy;

abstract class Vehicle2 {
	abstract void start();
}

class AnonymousInnerClass2 {
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2() {
			void start() {
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}