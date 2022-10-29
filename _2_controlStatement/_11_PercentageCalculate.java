package _2_controlStatement;

import java.util.Scanner;
/*
 * Take 5 subject marks from user and calculate its percentage than find grade of a student using if else ladder according
  to the percentage of marks obtained.
		  Percentage>=90A-Excellent
		  90>P>=80 B- Very Good
		  80>P>=70 C- Good
		  70>P>=60 D - Satisfactory
		  60>P>=50 E - WorkHard
		  50>P>=40 F - Just Passed
		  Percentage<40 Failed
 */
public class _11_PercentageCalculate 
{
	public static void main(String[] args) 
	{
		double totalNumber , percentage,maths, science, chemistry, physic, english;
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Math no : ");
		maths=sc.nextInt();
		System.out.println("Enter Your science no : ");
		science=sc.nextInt();
		System.out.println("Enter Your chemistry no : ");
		chemistry=sc.nextInt();
		System.out.println("Enter Your physic no : ");
		physic=sc.nextInt();
		System.out.println("Enter Your english no : ");
		english=sc.nextInt();
		sc.close();
		
		totalNumber=maths+science+chemistry+physic+english;
		percentage=(totalNumber/500)*100; 
		System.out.println("Your overall percentage is : "+percentage+" and your result is :");
		
		if (percentage>=90)
		{
			System.out.println("Excellent : Grade A");
		}
		else if (90>percentage && 80<=percentage)
		{
			System.out.println("very Good: Grade B");
		}
		else if (80>percentage && 70<=percentage)
		{
			System.out.println("Good: Grade C");
		}
		else if (70>percentage && 60<=percentage)
		{
			System.out.println("Satisfacorty: Grade D");
		}
		else if (60>percentage && 50<=percentage)
		{
			System.out.println("Work Hard: Grade E");
		}
		else if (50>percentage && 40<=percentage)
		{
			System.out.println("Just Passed: Grade F");
		}
		else
		{
			System.err.println("Failed");
		}
	}

}
