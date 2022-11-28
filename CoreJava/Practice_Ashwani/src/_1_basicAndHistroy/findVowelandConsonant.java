package _1_basicAndHistroy;
import java.util.Scanner;

public class findVowelandConsonant {
	void count(String str) {
		int vowel = 0, consonant = 0;
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowel++;
			} else
				consonant++;
		}
		System.out.println(" Vowel are : " + vowel);
		System.out.println(" Consonant are : " + consonant);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the words : ");
		String s = sc.next();
		findVowelandConsonant fvc = new findVowelandConsonant();
		fvc.count(s);
		sc.close();
	}
}
