package _1_basicAndHistroy;

class Main 
{
	public static void main(String[] args) 
		{
			Animal_Main ob=new Animal_Main();
			Birds_Main ob2=new Birds_Main();
			ob2.run();
			ob.eat();
		}
}

class Animal_Main
{
	void eat()
	{
		System.out.println("I am eating...");
	}
}
class Birds_Main
{
	void run()
	{		
		System.out.println("I am running...");
	}
}



