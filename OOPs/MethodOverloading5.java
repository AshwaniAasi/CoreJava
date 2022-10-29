package OOPs;

class MethodOverloading5 
{
	public static void main(String[] args) 
	{
		Test5 t5=new Test5();
		t5.display(49);
		t5.display(t5);
		
	}
}
class Test5
{
	void display (Object a)
	{
		System.out.println("1");
	}
	void display (int b)
	{
		System.out.println("2");
	}
	
}
