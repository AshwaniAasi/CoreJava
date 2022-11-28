package _1_basicAndHistroy;

class Outer2
{
	void show()
	{
		System.out.println("1");
		class Innerr
		{
			void show2()
			{
				System.out.println("2");
			}
		}
	}
//	void show3()
//	{
//		Innerr i=new Innerr();
//		i.show2();
//	}
}
class MethodLocalInnerClass2
{
	public static void main(String[] args)
	{
		Outer2 ob=new Outer2();
//		ob.show3();
	}
}