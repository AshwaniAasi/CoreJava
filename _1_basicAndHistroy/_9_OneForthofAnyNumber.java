package _1_basicAndHistroy;

import java.util.Scanner;
/*
 * WAP to calculate 25% of any numbers?
 */
public class _9_OneForthofAnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		float num=sc.nextFloat();
		System.out.println("you entered : "+num+'\n'+"25% of your number is : "+((25.0f/100f)*num));
		sc.close();
	}

}
