package _4_OOPs;
//-------------------------------------------Not pure Code-----------------------------------------------------------
import java.util.Scanner;

/*
 WAP to create a class name Student Print name, roll no and father name of student form user, than inherit the
 student to class Marks and enter the marks of 5 subject and calculate percentage, than after inherit the class
 Marks to class Grade and print the Grade of student according the percentage of student.
 percentage>90 A-Excellent
 90>percentage>80 B-Very Good
 80>percentage>70 C- Good
 70>percentage>60 D- Satisfactory
 60>percentage>50 E - Work Hard
 50>percentage>40 F - Just Passed
percentage<40 Failed.
 */
class Student2
{
	void details(int rollNo, String name, String fatherName)
	{
		System.out.println("Student Name : "+name);
		System.out.println("Student Roll Number : "+rollNo);
		System.out.println("Student Father name : "+fatherName);
	}
}

class Marks extends Student2
{
	double percentage;
	double marksPer(int math, int science, int art, int chemistry, int physic)
	{
		percentage=((math+science+art+chemistry+physic)/5);
		return percentage;
	}
}
class Grade extends Marks
{
	public void grade()
	{
		System.out.println("Your Percentage is : "+percentage+" %");
		if(percentage>=90)
		{
			System.out.println("Grade A - Excellent");
		}
		else if(90>percentage && percentage>=80)
		{
			System.out.println("Grade B - Very Good ");
		}
		else if(80>percentage && percentage>=70)
		{
			System.out.println("Grade C - Good ");
		}
		else if(70>percentage && percentage>=60)
		{
			System.out.println("Grade D - Satisfactory");
		}
		else if(60>percentage && percentage>=50)
		{
			System.out.println("Grade E - Work Hard");
		}
		else if(50>percentage && percentage>=40)
		{
			System.out.println("Grade F - Just Passed");
		}
		else if(40>percentage )
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}

public class _12_ 
{
	public static void main(String[] args) 
	{
		int math, science, chemistry,  physic, art;
		Scanner sc= new Scanner(System.in);
		
		Grade st=new Grade();
		System.out.println("Enter the Name :");
		String name=sc.nextLine();
		
		System.out.println("Enter the roll no :");
		int rollNo=sc.nextInt();
		
		System.out.println("Enter the father name :");
		String fatherName=sc.nextLine();
		
		System.out.println("\n==============================================");
		
		System.out.println("Enter the number of Math");
		math=sc.nextInt();
		
		System.out.println("Enter the number of Science");
		science=sc.nextInt();
		
		System.out.println("Enter the number of Chemistry");
		chemistry=sc.nextInt();
		
		System.out.println("Enter the number of Physic");
		physic=sc.nextInt();
		
		System.out.println("Enter the number of Art");
		art=sc.nextInt();
		
		st.details(rollNo, name, fatherName);
		
		st.marksPer(math, science, chemistry, physic, art);
		
		st.grade();
		
		sc.close();
	}
}
