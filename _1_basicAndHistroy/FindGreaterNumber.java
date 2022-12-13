package _1_basicAndHistroy;
class FindGreaterNumber {
	public static void main(String[] args) {
		// int a=100, b=90, c=888;
		String a = "Ashwani", b = "Anuradha", c = "Anushwi";
		if (a.length() > b.length() & a.length() > c.length()) {
			System.out.println("A is the Greatest Number");
		} else if (b.length() > a.length() & b.length() > c.length()) {
			System.out.println("B is the Greatest Number");
		} else {
			System.out.println("C is the Greatest Number");
		}
		System.out.println(a.length() + " : " + b.length() + " : " + c.length());
	}
}