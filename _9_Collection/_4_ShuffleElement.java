package _9_Collection;

import java.util.ArrayList;
import java.util.Collections;

//WAP to shuffle elements in an arrayList
public class _4_ShuffleElement 
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
		
		System.out.println("The elements before shuffling are : \n"+al);
		Collections.shuffle(al);
		System.out.println("The elements after shuffling are : \n"+al);
		
	}
}
