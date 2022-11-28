package _1_basicAndHistroy;
import java.util.ArrayList;

class Test9 
{
public static void main(String[] args) 
{
	ArrayList al1=new ArrayList();
	al1.add(10);
	al1.add("ashwani123");
	al1.add(50);
	System.out.println("=====================================");
	System.out.println(al1.get(2));
	System.out.println("=====================================");
	al1.set(1, 100);
	System.out.println(al1);
	System.out.println("=====================================");
	System.out.println(al1.lastIndexOf(200));
}
}
