package StreamAPI;

import java.util.ArrayList;

//WAP to replace character with a into Z
public class ReplaceCharacter {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ashwani");
		al.add("Rani");
		al.add("Vikash");
		al.add("Anu");
		al.add("Sonu");
		
		al.stream().map(e->(e.replace("a", "Z"))).forEach(e->System.out.println(e));
		
	}
}
