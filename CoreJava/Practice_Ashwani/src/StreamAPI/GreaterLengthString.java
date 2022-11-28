package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//WAP to print greater length than 5 of a String & change to all in the upper case.
public class GreaterLengthString {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ashwani");
		al.add("Rani");
		al.add("Vikash");
		al.add("Anu");
		al.add("Sonu");
		
//		al.stream().filter(e->(e.length()>5)).forEach(e->System.out.println(e)); //only for find
		
		List<String> collect = al.stream().filter(e->(e.length()>5)).collect(Collectors.toList());
		
		System.out.println(collect.toString().toUpperCase());
		
		
	}
}
