package _1_basicAndHistroy;

public class findDublicate {
	public static void main(String[] args) {
		int count;
		String str = "Ashwani Kumar Chaurasiya";
		char str1[] = str.toCharArray();
		for (int a = 0; a < str1.length; a++) {
			count = 1;
			for (int b = a + 1; b < str1.length; b++) {
				if (str1[a] == str1[b] && str1[a] != ' ') {
					count++;
				}
			}
			if (count > 1 && str1[a] != 0) {
				System.out.print(str1[a] + ", ");
			}
		}
	}
}
