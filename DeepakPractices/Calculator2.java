import java.util.Scanner;

class Calculator2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number : ");
		long no1=s.nextLong();
		System.out.println("Enter Second number : ");
		long no2=s.nextLong();
		System.out.println("Enter symbol ( + , - , * , / ) ");
		String sym=s.next();
		switch (sym)
		{
		case "+": System.out.println("First no is : "+no1+'\n'+" Second no is : "+no2+'\n'+"Sum of these numbers is : "+(no1+no2));
		break;
		case "-": System.out.println("First no is : "+no1+'\n'+" Second no is : "+no2+'\n'+"Substration of these numbers is : "+(no1-no2));
		break;
		case "*": System.out.println("First no is : "+no1+'\n'+" Second no is : "+no2+'\n'+"Multiplication of these numbers is : "+(no1*no2));
		break;
		case "/": System.out.println("First no is : "+no1+'\n'+" Second no is : "+no2+'\n'+"Division of these numbers is : "+(no1/no2));
		break;
		default : System.out.println("Invalid Input");
		
		}
	}
}
