package StreamAPI;

// WAP of a method reference ( : : ) without creating object of interface
interface I
{
	void m1(int a);
}
class A 
{
	void m2(int a)
	{
		System.out.println("I am m2 method of Class A : "+a);
	}
}

public class MethodReference {
	public static void main(String[] args) {
		
	A ob=new A();
	I i=ob :: m2;					// doing mapping of m2 method to Interface object
	i.m1(30);							// calling interface method through object
		
	}
}
