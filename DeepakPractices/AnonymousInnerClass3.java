interface Vehicle3
{
	void start();
}
class AnonymousInnerClass3
{
	public static void main(String[] args)
	{
		Vehicle3 v=new Vehicle3()
		{
			public void start()
			{
				System.out.println("starts with key");
			}
		};
		v.start();
	}
}