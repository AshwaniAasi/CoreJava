package _1_basicAndHistroy;
import java.util.ArrayList;

class Test6 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(40);
		al1.add(870);
		ArrayList al2=new ArrayList();
		al2.add(50);
		al2.add(560);
		al2.add(565);
		al2.add(870);
		al2.add("Deepak");
		al1.add(al2);
		System.out.println(al1.contains(al2));
		System.out.println(al1);
	}
}
