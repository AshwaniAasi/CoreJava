package _2_controlStatement;

import java.util.Scanner;
/*
 	WAP to check Armstrong Number. (A positve number is called Armstrong number if it is equal to the sum of cubes of
 	its digits e.g 153= (1*1*1)+(5*5*5)+(3*3*3)
 */
public class _22_AmastrongNumber 
{
	public static void main(String[] args) 
	{
		int orginalNumber, rem=0, result =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		sc.close();
		orginalNumber=number;
		while (orginalNumber !=0)
		{
			rem=orginalNumber%10;
			result +=rem*rem*rem;
			orginalNumber /=10;
		}
		if(result==number)
		{
			System.out.println(number+" is Armstrong number.");
		}
		else
			System.out.println(number+" is not Armstron Number");
	}
}
