package StreamAPI;

import java.util.ArrayList;

// WAP to sorting of String
public class SortedString {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ashwani");
		al.add("Rani");
		al.add("Vikash");
		al.add("Anu");
		al.add("Sonu");
		
		al.stream().forEach(e->System.out.println(e));
		System.out.println("-------------------------------------------------");
		al.stream().sorted().forEach(e->System.out.println(e)); //normal
		System.out.println("-------------------------------------------------");
		al.stream().sorted((x,y)->x.compareTo(y)).forEach(e->System.out.println(e));  //accending
		System.out.println("-------------------------------------------------");
		al.stream().sorted((x,y)->-x.compareTo(y)).forEach(e->System.out.println(e));  //dessending
		
		
	}
}
