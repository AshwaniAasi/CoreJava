package ArrayList_practice;

import java.util.ArrayList;

public class Test7 {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(50);
		al1.add(20);
		al1.add(60);
		al1.add(80);
		al1.add("Ashwani");
		System.out.println(al1.size());
		Object [] obj=al1.toArray();
		
		for(int i=0; i<obj.length; i++)
		{
			System.out.println(obj [i]);
		}
		
//		for(Object i:obj)
//		{
//			System.out.println(i);
//		}
		
	}
}
