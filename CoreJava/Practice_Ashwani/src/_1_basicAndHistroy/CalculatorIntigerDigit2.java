package _1_basicAndHistroy;

class CalculatorIntigerDigit2 {
	public static void main(String[] args) {
		int no = 56;
		int leng = 0;
		int temp = no;
		while (temp != 0) {
			leng = leng + 1;
			temp = temp / 10;
		}
		System.out.println("Length of " + no + " is " + leng);
	}
}
