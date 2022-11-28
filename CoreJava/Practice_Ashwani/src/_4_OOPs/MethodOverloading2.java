package _4_OOPs;

public class MethodOverloading2 
{
 public static void main(String[] args) 
 {
	Test2 t2=new Test2();
	t2.display();
	t2.display(10);
//	t2.display(20, 50);
	t2.display(5, 0);
 }
}
class Test2
{
	void display()
	{
		System.out.println("1");
	}
	void display(int a)
	{
		System.out.println("2");
	}
	void display(int a, int b)
	{
		System.out.println("3");
	}
}
