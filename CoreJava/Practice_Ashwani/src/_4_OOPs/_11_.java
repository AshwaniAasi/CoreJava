package _4_OOPs;
/*
 	WAP to create a class named as Area, Create three constructors with the concept of Constructor overloading
 	and print the area of square, rectangle and circle.
 */
class Area1
{
	float area=0;
	Area1(int a)
	{
		area=(a*a);
		System.out.println("The area of square is : "+ area);
	}
	Area1(int l, int b)
	{
		area=l*b;
		System.out.println("The area of Rectangle are : "+area);
	}
	Area1(float pai, int r)
	{
		area=pai*r*r;
		System.out.println("The area of Circle is : "+ area);
	}
}
public class _11_ 
{
	public static void main(String[] args) 
	{
		new Area1(6); //square 36
		new Area1(6, 2); //Rectangle 12
		new Area1(3.14f, 5); //circle 78.5
	}
}
