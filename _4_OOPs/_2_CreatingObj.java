package _4_OOPs;
/*
 	WAP to assign and print the name and roll number of two student having name "Sam" and "John" respectively 
 	by creating two objects of class "Student".
*/

class Student1
{
	String name;
	int rollNo;
	
	void display()
	{
		System.out.println("Student name : "+name +"\n"+"Student Roll Number : "+rollNo);
	}
}

public class _2_CreatingObj 
{
	public static void main(String[] args) 
	{
		Student1 st=new Student1();
		st.name="Sam";
		st.rollNo=16;
		Student1 st2=new Student1();
		st2.name="John";
		st2.rollNo=45;
		st.display();
		System.out.println("-------------------------------");
		st2.display();
	
	}
}
