public class Animal
{
	int age=10;
	String color="black";
	
	void eat()
	{
		System.out.println("I am eating...");
	}
	public static void main(String[] args) 
	{
		Animal buzo=new Animal();
		System.out.println("Age of buzo : "+buzo.age);
		System.out.println("Color of buzo : "+buzo.color);
		buzo.eat();
	}
}