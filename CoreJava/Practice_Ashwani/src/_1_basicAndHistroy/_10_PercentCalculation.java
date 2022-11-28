package _1_basicAndHistroy;

import java.util.Scanner;
/*
 * WAP to calculate x is what percent of y?
 */
public class _10_PercentCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your numbers : ");
		double a=sc.nextDouble() , b=sc.nextDouble();
		System.out.println("you Enter : "+a+" & "+b+'\n'+a+" is "+((a/b)*100)+" % of "+b);
		sc.close();
	}

}
