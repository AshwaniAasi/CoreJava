package _9_Collection;

import java.util.ArrayList;

//WAP to test the arrayList are empty or not?
public class _5_EmptyOrNot 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al.add(52);
		al.add(72);
		al.add(57);
		al.add(53);
		al.add(22);
		al.add(59);
		al.add(73);
		
		System.out.println("The elements are : "+al);
		boolean empty = al.isEmpty();
		System.out.println(empty); 					//false
		boolean empty2 = al2.isEmpty();
		System.out.println(empty2);  					 //true
		
	}
}
