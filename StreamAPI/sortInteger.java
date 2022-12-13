package StreamAPI;

import java.util.ArrayList;

//WAP to sort integer value
public class sortInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(52);
		al.add(14);
		al.add(522);
		al.add(32);
		al.add(42);
		al.add(82);
		
		al.stream().sorted().forEach(e->System.out.print(e+", ")); //normally
		System.out.println("\n----------------------------------------------");
		
		al.stream().sorted((x,y)->x.compareTo(y)).forEach(e->System.out.print(e+", ")); //accending
		System.out.println("\n----------------------------------------------");
		
		al.stream().sorted((x,y)->-x.compareTo(y)).forEach(e->System.out.print(e+", ")); //decending
		System.out.println("\n----------------------------------------------");
		
	}
}
