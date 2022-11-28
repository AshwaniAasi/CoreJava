package _1_basicAndHistroy;

class constructorAnimal4 {
	int age;
	String color;
	String breed;

	constructorAnimal4(int age1, String color1, String breed1) {
		age = age1;
		color = color1;
		breed = breed1;
	}

	void eat() {
		System.out.println("I am eating...");
	}

	void run() {
		System.out.println("I am runing...");
	}

	void sleep() {
		System.out.println("I am sleeping...");
	}

	public static void main(String[] args) {
		constructorAnimal4 rocky = new constructorAnimal4(7, "black", "desi");
		constructorAnimal4 lucy = new constructorAnimal4(5, "white", "western");
		constructorAnimal4 Serru = new constructorAnimal4(10, "golden", "Labrador");

		System.out.println("rocky' age :" + rocky.age);
		System.out.println("rocky' color :" + rocky.color);
		System.out.println("rocky' breed :" + rocky.breed);
		rocky.run();

		System.out.println("---------------------------------------");

		System.out.println("lucy' age :" + lucy.age);
		System.out.println("lucy' age :" + lucy.color);
		System.out.println("lucy' age :" + lucy.breed);
		lucy.sleep();

		System.out.println("---------------------------------------");

		System.out.println("Serru' age :" + Serru.age);
		System.out.println("Serru' age :" + Serru.color);
		System.out.println("Serru' age :" + Serru.breed);
		Serru.eat();

	}
}
