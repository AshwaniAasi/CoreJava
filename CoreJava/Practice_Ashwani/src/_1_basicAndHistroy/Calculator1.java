package _1_basicAndHistroy;
class Calculator1_switch_case {
	public static void main(String[] args) {
		int a = 100, b = 50;
		String str = " ";
		switch (str) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "":
			System.out.println(a / b);
			break;
		default:
			System.out.println("Invalid");
		}
	}
}