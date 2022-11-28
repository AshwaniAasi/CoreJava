package _2_controlStatement;

import java.util.Scanner;
/*
  Program to calculate ElectricBill Using the Following Conditions
  1-100 units = Rs 10/unit
  100-200 units = Rs 15/unit
  200-300 units = Rs 20/unit
  above 300 units = Rs 25/unit
 */
public class _12_ElectricBillCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Unit of Electricity : ");
		int unit=sc.nextInt();
		
		if (unit <=100)
		{
			System.out.println(" your Amount to pay : "+unit*10);
		}
		else if ( unit <=200)
		{
		int cal= (1000+(unit-100)*15);
			System.out.println("Your Amount to be pay : "+cal);
		}
		else if ( unit <=300)
		{
			int cal=(2500+(unit-200)*20);
			System.out.println("your Amount to pay : "+cal);
		}
		else
		{
			int cal= (4500+(unit-300)*25);
			System.out.println("Your Amount to pay : "+cal);
		}
			
	}		
}
