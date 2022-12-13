package _4_OOPs;

class MethodOverloading1 
{
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		t1.display(10);
		t1.display("Ashwani");
	}
}
class Test1
{
	void display (String a)
	{
		System.out.println(a);
	}
	void display (int a)
	{
		System.out.println(a);
	}
}
