package _4_OOPs;
/*
 	WAP to print area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named
 	"Triangle" without any parameter in its constructor.
 */
class Triangle
{
	int h, l, b;
	
	double getPerimeter() 
	{
		return (l+b+h)/2.0;	
	}
	double getArea()
	{
		double s = getPerimeter();
		return Math.sqrt(s*(s-h)*(s-l)*(s-b));
	}
}

public class _3_
{
	public static void main(String[] args) 
	{
		Triangle tri=new Triangle();
		tri.l=2;
		tri.b=6;
		tri.h=5;
		System.out.println("perimeter are : "+tri.getPerimeter());
		System.out.println("area are : " +tri.getArea());
		
	}
	
}
