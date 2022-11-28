package _7_Inner_Class;
/*
 WAP to create a non static inner class with a static method.
 */
class Outer3
{
	class Inner
	{
		/*
		 * It is a illegal combination. Only static variables are allowed and those should be final.....
		 */
//		static void getAdd(int a, int b)
//		{
//			int z=a+b;
//			System.out.println(z);
//		}
		
		public static final int a=45;
	}
}
public class _4_NonStaticInnerClassWithStaticMethod 
{
	public static void main(String[] args) 
	{
//		int x=40, y=90;
//		Outer3.Inner.getAdd(x, y);
		int i = Outer3.Inner.a;
		System.out.println(i);
	}
}
