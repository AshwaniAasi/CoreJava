package _1_basicAndHistroy;
class Outerr
{
	private int a=10;
	class Inner
	{
		void show2()
		{
			System.out.println(a);
		}
	}
}
class MemberInnerClass2
{
	public static void main(String[] args)
	{
		Outerr ob1=new Outerr();
		Outerr.Inner ob2=ob1.new Inner();
		ob2.show2();
	}
}