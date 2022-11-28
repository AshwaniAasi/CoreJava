package _4_OOPs;
/*
WAP to create a class named "shape". In this class, we have three subclasses circle, triangle and square each
 class has one member function named draw(). Create these using the concept of method overriding.
 */

class Shape
{
	void draw()
	{
		System.out.println("I am in shape class");
	}
}
class Circle extends Shape
{
	void drawCir()
	{
		System.out.println("I am in Circle class");
	}
}
class Triangle1 extends Shape
{
	void drawTri()
	{
		System.out.println("I am in Triangle class");
	}
}
class Square extends Shape
{
	void drawSq()
	{
		System.out.println("I am in Square class");
	}
}
public class _8_ 
{
	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.draw();
	System.out.println("==========================================");
		Circle s1=new Circle();
		s1.draw();
		s1.drawCir();
		System.out.println("==========================================");
		Triangle1 s2=new Triangle1();
		s2.draw();
		s2.drawTri();
		System.out.println("==========================================");
		Square s3=new Square();
		s3.draw();
		s3.drawSq();
		System.out.println("==========================================");
	}
}
