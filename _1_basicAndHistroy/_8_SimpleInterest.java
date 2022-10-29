package _1_basicAndHistroy;

import java.util.Scanner;
/*
 * WAP to find the simple interest ((P*R*T)/100)
 */
public class _8_SimpleInterest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount : ");
		float amount=sc.nextFloat();
		System.out.println("Enter Rate of interest : ");
		float rate=sc.nextFloat();
		System.out.println("Enter Time of period : ");
		float time=sc.nextFloat();
		System.out.println("Your Entry :"+'\n'+"Amount : "+amount+" Rs"+'\n'+"Rate of Interest : "+rate+" %"+'\n'+"Time : "+time+" Years"+'\n'+"Your Simple Interest is : "+((amount*time*rate)/100));
	}
}
