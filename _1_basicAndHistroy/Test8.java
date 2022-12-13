package _1_basicAndHistroy;
import java.util.ArrayList;

class Test8 {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(60);
		al1.add(430);
		al1.add(87);
		al1.add(340);
		al1.add(230);
		al1.add("Anuradha");
		System.out.println(al1.size());
		System.out.println("==============================");
		System.out.println(al1);
		
		Object [] obj = al1.toArray();
		System.out.println("==============================");
		for (int i=0; i<obj.length; i++)
		{
			System.out.println(obj[i]);
		}
	}

}
