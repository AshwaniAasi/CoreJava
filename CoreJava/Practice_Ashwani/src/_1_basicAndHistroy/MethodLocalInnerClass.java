package _1_basicAndHistroy;
class Outer1
{
	void show()
	{
		System.out.println("1");
		class Inner
		{
			void show2()
			{
				System.out.println("2");
			}
		}

		Inner i=new Inner();
		i.show2();
	}
}
class MethodLocalInnerClass
{
	public static void main(String[] args)
	{
		Outer1 ob=new Outer1();
		ob.show();
	}
}