package _3_array;

public class Test1 
{
	public static void main(String[] args) 
	{
		int [] a=new int[4];
		a[0]=10;
		a[1]=30;
		a[2]=50;
		a[3]=20;
		System.out.println(a); //[I@2c7b84de
		System.out.println(a.getClass());//class [I
		System.out.println(a.toString());//[I@2c7b84de
		System.out.println(a.length);//4
		System.out.println(a.clone());//[I@3fee733d
		System.out.println(a[0]);//10
		for(int var:a)
		{
			System.out.print(var+" "); //10 30 50 20 
		}
	}
}
