package _1_basicAndHistroy;

import java.util.Scanner;
/*
 * WAP to swap two numbers in java?
 */
public class _6_SwapTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp, x, y;
		System.out.println("enter first & second number : ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swaping the number was : " +" x : "+x+" y : "+y );
	//	temp=x;
	//	x=y;
	//	y=temp;
		temp=y;
		y=x;
		x=temp;
		System.out.println("After swapping the number is : "+"x : "+x+" y : "+y);

	}

}
