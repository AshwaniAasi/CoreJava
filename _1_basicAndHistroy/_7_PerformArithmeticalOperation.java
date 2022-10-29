package _1_basicAndHistroy;

import java.util.Scanner;
/*
 * WAP to perform arithmetical operations(+,-,*,/) on two numbers entered by user?
 */
public class _7_PerformArithmeticalOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First & Second number :");
		double a=sc.nextDouble(), b=sc.nextDouble();
		sc.close();
		System.out.println("You Enter : "+a+" & "+b+'\n'+"Your Result is below : "+'\n'+"Addtions : "+(a+b)+'\n'+"Subtraction : "+(a-b)+'\n'+"Multiplication : "+(a*b)+'\n'+"Divison : "+(a/b));
	}

}
