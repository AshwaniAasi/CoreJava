package Data_Structure;

import java.util.ArrayList;

public class ArrayAndArrayList 
{
	public static void main(String[] args) 
	{
		int[] arr =new int [3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		System.out.println(arr);
		for (int i:arr)
		{
			System.out.println(i);
		}
		System.out.println("================================");
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(600);
		al.add(900);
		al.add(8700);
		al.add(320);
		al.add(870);
		System.out.println("================================");
		System.out.println(al);
		System.out.println("================================");
		for (int i=0; i<al.size();i++)			
		{
			System.out.println(al.get(i));
		}
	}
}
