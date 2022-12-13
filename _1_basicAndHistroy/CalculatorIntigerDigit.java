package _1_basicAndHistroy;

class CalculatorIntigerDigit {
	public static void main(String[] args) {
		long no = 58857478457654456l;
		int leng = 0;
		long temp = no;
		while (temp != 0) {
			leng = leng + 1;
			temp = temp / 10;
		}
		System.out.println("Length of " + no + " is " + leng);
	}
}
