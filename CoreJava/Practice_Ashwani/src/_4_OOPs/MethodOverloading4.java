package _4_OOPs;

class MethodOverloading4 
{
	public static void main(String[] args) 
	{
		Test4 t4=new Test4();
		t4.display(30);
		t4.dispaly(38);
	}
}
class Test4
{
	void display(int... a)
	{
		System.out.println("1"+" : "+a);
	}
	void dispaly(int a)
	{
		System.out.println("2"+" : " +a);
	}
}
