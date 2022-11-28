package LambdaExpression;

interface LambdaDemo
{
	abstract void getDisplay();
	
	default void getPlay()
	{
		System.out.println("I am in Play method");
	}
	static void getSing()
	{
		System.out.println("I am in Sing method");
	}
}

public class _1_SimpleLambda 
{
	public static void main(String[] args) 
	{
//		LambdaDemo ld=new LambdaDemo() {
//			
//			@Override
//			public void getDisplay()
//			{
//				System.out.println("I am a Implemention of Display method");
//			}
//		};
//		
//		ld.getPlay();
//		ld.getDisplay();
//		LambdaDemo.getSing();
		
		//Lambda expression to implemet above
		LambdaDemo ld= () ->System.out.println("I am Implementation of Display method.");
		ld.getDisplay();
		
	}
}
