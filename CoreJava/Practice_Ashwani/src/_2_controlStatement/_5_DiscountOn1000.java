package _2_controlStatement;

import java.util.Scanner;
/*
 * One product will cost 100, a shop will give discount of 10% if the cost of purchased quantity is more then 1000.
 */
public class _5_DiscountOn1000 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Quantity You purchased :");
		int no=sc.nextInt();
		if ((no*100)>1000)
		{
			System.out.println("your are eligible for 10 % discount"+" and Discount amount is : "+(no*100*0.1)+'\n'+"Your total cost is : "+(no*100)+'\n'+"You have to pay only : "+((no*100)-(no*100*0.1)));
		}
	}

}
