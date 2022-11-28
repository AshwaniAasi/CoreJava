package _1_basicAndHistroy;

import java.util.Scanner;

/*
 * WAP to find the parimeter of a rectangle. (formula=2*(l+b))
 */
public class _5_PerimeterOfRectangle 
{
	public static void main(String[] args) 
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		l=sc.nextDouble();
		System.out.println("Enter Breath of Rectangle");
		b=sc.nextDouble();
		System.out.println("The perimeter of Rectangle is :"+ (2*(l+b)));
		
	}
}
