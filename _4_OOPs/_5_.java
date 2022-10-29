package _4_OOPs;

import java.util.Scanner;

/*
 	WAP to print the area of a rectangle by creating a class named "Area" taking the values of its length and breadth as
 	parameters of its constructor and having a method named "returnArea". Which returns the area of the rectangle. 
 	Length and breadth of rectangle are entered through keyboard.
 */

class Area
{
	int length, breadth;
	Area (int l, int b)
	{
		length=l;
		breadth=b;
	}
	double returnArea()
	{
		return length*breadth;
	}
}
public class _5_ {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle: ");
		int length=s.nextInt();
		System.out.println("Enter the Breadth of Rectangle: ");
		int breadth=s.nextInt();
		Area a=new Area(length, breadth);
		System.out.println(a.returnArea());
	}
}
