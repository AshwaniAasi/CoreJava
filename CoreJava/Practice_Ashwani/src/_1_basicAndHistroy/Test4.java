package _1_basicAndHistroy;
import java.util.ArrayList;

class Test4 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(80);
		al.add("Deepak");
		al.add(90);
		al.add(50);
		System.out.println(al);
		System.out.println("remove"+al.remove(2));
		System.out.println(al);
	}
}
