package _9_Collection;
//WAP to iterate through all elements in an arrayList
import java.util.ArrayList;

public class _1_iterateAllElements 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(52);
		al.add(72);
		al.add(57);
		al.add(53);
		al.add(22);
		al.add(59);
		al.add(73);
		System.out.println("The elements are : "+al);
	
		for(int i:al)
		{
			System.out.println(i);
		}
		
	}
}
