package LambdaExpression;

import java.util.ArrayList;

public class _4_LambdaArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		// Using lambda expression to print all elements of al
		al.forEach(n-> System.out.println(n));
		
		// Using lambda expression to print even elements of al
	al.forEach(n -> {if (n%2 == 0 ) System.out.println(n); });
		
	}
}
