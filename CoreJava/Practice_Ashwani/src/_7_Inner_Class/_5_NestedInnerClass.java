package _7_Inner_Class;
/*
 WAP to create a Nested inner class in local method.
 */
class Outer4
{
	public void display(int x, int y)
	{
		class Inner
		{
			public void add(int x, int y)
			{
				int z=x+y;
				System.out.println(z);
			}
		}
		
		Inner in=new Inner();
		in.add(x, y);
	}
}

public class _5_NestedInnerClass 
{
	public static void main(String[] args) 
	{
		Outer4 ob=new Outer4();
		ob.display(23, 56);
	}
}
