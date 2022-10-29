package OOPs;

public class AAA 
{
	public static void main(String[] args) 
	{
		A a7=new A();
		a7.getDisplay(19);
		a7.getDisplay(60);
		a7.getDisplay(61);
		a7.getDisplay(62);
		a7.getDisplay(64);
		a7.getDisplay(67);
		a7.getDisplay(66);
	
	}
}
class A
{
//	void getDisplay(int a)
//	{
//		System.out.println(" first method "+a);
//	}
	void getDisplay (int...aa)
	{
		for(int i:aa)
		{
			System.out.print(i+" ");
		}
	//	System.out.println();
	}
}
