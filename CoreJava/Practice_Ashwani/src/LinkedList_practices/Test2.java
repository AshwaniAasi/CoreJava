package LinkedList_practices;

import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.add("deepak");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add("rahul");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add("amit");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add("aaa");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add("deespak");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add(234);
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add("*");
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add(0);
		System.out.println("=======================");
		System.out.println(l1);
		
		l1.add(null);
		System.out.println("=======================");
		System.out.println(l1);		
		
		l1.remove();// by default 0 index element was removed
		System.out.println("=======================");
		System.out.println(l1);
	
		//l1.descendingIterator();
		System.out.println("=======================");
		System.out.println(l1.descendingIterator());
	
		//	l1.getFirst();
		System.out.println("=======================");
		System.out.println(l1.getFirst());
		
		System.out.println(l1.getLast());
		
		System.out.println(l1.getClass());
		
		l1.removeAll(l1);
		System.out.println("=======================");
		System.out.println(l1);
	}
	
}
