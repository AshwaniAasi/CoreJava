package ArrayList_practice;

import java.util.ArrayList;

public class Test1 
{
	public static void main(String[] args) 
	{
		int [] arr=new int [4];
		arr[0]=10;
		arr[1]=70;
		arr[2]=30;
		arr[3]=80;
	//	arr[4]=50;
		System.out.println(arr);
		System.out.println("====================");
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("====================");
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("====================");
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(400);
		al.add(600);
		al.add(800);
		al.add(500);
		al.add(400);
		System.out.println(al);
		System.out.println("====================");
		for (Object obj:al)
		{
			System.out.println(obj);
		}
		System.out.println("====================");
		for (int j=0; j<al.size(); j++)
		{
			System.out.println(al.get(j));
		}
	}
}
