package _4_OOPs;

import java.util.Scanner;

/*
 	WAP to perform arithmetic calculations. Create a class named Calculation, create four parameterized methods named add,
 	Sub, mult, div: pass two parameters each and perform respective operations. Ask the user what he want to perform
 	and continue the operation till the user wants to perform.
 */
class Calculation
{
	int add(int a, int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else
			return b-a;
	}
	double multi(int a, int b)
	{
		return a*b;
	}
	double div(int a, int b)
	{
		if(a>b)
		{
			return a/b;
		}
		else
			return b/a;
		
	}
}
public class _7_ 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int no1=s.nextInt();
		System.out.println("Enter the Second number : ");
		int no2=s.nextInt();
		
		System.out.println("what you want to perform press with options :\n1. Add\n2. Subtract\n3. Multiplication\n4. Division");
		int opration=s.nextInt();
		switch (opration)
		{
		case 1: System.out.println("Addition of Two number is : "+new Calculation().add(no1, no2));
		break;
		case 2: System.out.println("Subtraction of two number is : "+ new Calculation().sub(no1, no2));
		break;
		case 3: System.out.println("Multiplication of Two number is : "+ new Calculation().multi(no1, no2));
		break;
		case 4: System.out.println("Division of Two positive number is : "+new Calculation().div(no1, no2));
		break;
		default: System.out.println("Invalid Input.... Pls Try with existing Options");
		break;
		
		}
		
		
		
		
	}
}
