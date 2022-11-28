package _1_basicAndHistroy;
class Animall {
	void eat() {
		System.out.println("I am eating...");
	}
}

class Birds {
	void run() {

		System.out.println("I am running...");
	}

	public static void main(String[] args) {
		Animall ob = new Animall();
		Birds ob2 = new Birds();
		ob2.run();
		ob.eat();
	}
}
