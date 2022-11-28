package _4_OOPs;
/*
WAP to print the area of two rectangles having side(4,5) and (5,8) respectively by creating a class named "Rectangle"
 with a method name "Area" which returns the area, length and breadth passed as parameters to its constructor.
 */
class Rectangle
{
	int length , breadth;
	Rectangle(int l, int b)
	{
		breadth=b;
		length=l;
	}
	
	double getArea()
	{
		return length*breadth;
	}
	
	double getParimeter()
	{
		return 2*(length+breadth);
	}
}
public class _4_ 
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(4, 5);
		double area = r.getArea();
		System.out.println("Area of Rectagle is : "+area+"\n"+"Parimeter of rectangle is : "+r.getParimeter());
		
		Rectangle r2=new Rectangle(5, 8);
		r2.getArea();
		r2.getParimeter();
		System.out.println("Area of rectangle is : "+r2.getArea()+"\n"+ "Parimeter of rectangle is : "+r2.getParimeter());
	}
}
