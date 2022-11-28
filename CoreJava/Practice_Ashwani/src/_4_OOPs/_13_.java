package _4_OOPs;

import java.util.Scanner;
/*
 	Create a class named MyColor and initialize a variable named color with value white. Create child class named
 	pickOne inheriting the class MyColor. Inside PickOne create variable named color and ask the user to enter one 
 	color name and print both the color variable value inside the PickOne class.
 */
class MyColor
{
	String color="white";
}
class PickOne extends MyColor
{
	String color;
	Scanner sc=new Scanner(System.in);
	void printColor()
	{
		System.out.println("Enter the any color name");
		color=sc.next();
		System.out.println("color value from PickOne class : "+this.color);
		System.out.println("color value form mycolor class : "+super.color);
	}
}
public class _13_ 
{
	public static void main(String[] args) 
	{
		new PickOne().printColor();
	}
}
