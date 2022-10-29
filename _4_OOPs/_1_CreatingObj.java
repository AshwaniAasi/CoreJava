package _4_OOPs;
/*
 WAP to create a class named "Student" with String Variable "name" and Integer variable "rollNo". 
 Assign the value of rollNo as "2" and that of name as "Reetu" by creating an object of the class Student.
 */
class Student
{
	String name;
	int rollNo;
}
public class _1_CreatingObj
{
	public static void main(String[] args) 
	{
		Student st=new Student();
		st.name="Reetu";
		st.rollNo=2;
		System.out.println("Name : "+st.name + "\nRoll No : "+st.rollNo);
		
	}
}
