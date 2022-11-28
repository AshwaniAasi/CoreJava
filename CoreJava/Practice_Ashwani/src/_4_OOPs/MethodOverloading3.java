package _4_OOPs;

class MethodOverloading3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.Display(101, "Anuradha", 201);
	}
}

class Test3 {
	void Display(int a, String b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}
