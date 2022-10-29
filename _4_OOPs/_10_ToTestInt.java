package _4_OOPs;
/*
 WAP to create a interface named test. In this Interface the member function is square. Implements this interface in 
 the arithmetic class. Create one new class called ToTestInt in this class use the object of the arithmetic class.
 */
interface Test
{
	int square(int a);
}
class Arithmetic implements Test
{
	int s=0;
	public int square(int b) 
	{
		s=b*b;
		System.out.println("The Square of "+b+" is : "+s);
		return s;
	}
}
public class _10_ToTestInt 
{
	public static void main(String[] args) 
	{
		Test t= new Arithmetic();
		t.square(10);
	}
}
