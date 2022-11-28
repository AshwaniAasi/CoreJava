package _1_basicAndHistroy;
import java.util.ArrayList;

class Test7 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(null);
		al1.add(29);
		al1.add(43);
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1.isEmpty());
	}
}
