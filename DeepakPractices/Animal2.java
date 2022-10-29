
class Animal2 
{
	int age=10;
	String color="Black";
	void eat()
	{
	System.out.println("1");
	}
	void run()
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Animal2 buzo=new Animal2();
		System.out.println("Age of Buzo : "+buzo.age);
		System.out.println("Age of Buzo : "+buzo.color);
		buzo.eat();	
		buzo.run();
	}
}
