package _1_basicAndHistroy;
/*
 * Create a class named Student with variable String name, int roll no and address. (Assign data from user)?
 */
import java.util.Scanner;

public class _3_Student 
{
	public static void main(String[] args) 
	{
		String name;
		int rollno;
		String address;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name : ");
		name=sc.nextLine();
		
		System.out.println("Enter your Roll No : ");
		rollno=sc.nextInt();
		
		System.out.println("Enter your Address : ");
		sc.nextLine(); //When there is no data after this line then first need to run method and after then store in variable
		address=sc.nextLine();
		System.out.println("=================================================");
		System.out.println("Hi : "+name+" , Your Roll No is : "+rollno+'\n'+" ,and Your Address is : "+address);
		
		
	}

}
