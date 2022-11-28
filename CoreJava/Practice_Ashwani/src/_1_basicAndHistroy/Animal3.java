package _1_basicAndHistroy;

class Animal3 {
	int age;
	String color;

	void eat() {
		System.out.println("I am eating...");
	}

	void run() {
		System.out.println("I am running...");
	}

	public static void main(String[] args) {
		Animal3 buzo = new Animal3();
		Animal3 pussy = new Animal3();
		buzo.age = 10;
		buzo.color = "black";
		pussy.age = 6;
		pussy.color = "White";
		System.out.println("Buzo's age : " + buzo.age);
		System.out.println("Buzo's color : " + buzo.color);
		buzo.eat();
		buzo.run();
		System.out.println("==========================================");
		System.out.println("Pussy's age : " + pussy.age);
		System.out.println("Pussy's color : " + pussy.color);
		pussy.run();
		pussy.eat();
	}
}
