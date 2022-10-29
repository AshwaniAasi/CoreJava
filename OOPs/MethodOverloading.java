package OOPs;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.sum(50, 30);
		t.sum(40f, 90f);
	}
}
class Test
{
	void sum(int a, int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	void sum(float a, float b)
	{
		float res=a+b;
		System.out.println(res);
	}
}
