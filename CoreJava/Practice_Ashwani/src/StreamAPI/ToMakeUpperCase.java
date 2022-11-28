package StreamAPI;

import java.util.ArrayList;

public class ToMakeUpperCase {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ashwani kumar");
		al.add("anuradha");
		al.add("radha");
		al.add("anu ashwani");
		al.add("anurshWi");
		al.add("RaNIadha");
		
		
		al.stream().map(e->(e.toUpperCase())).forEach(e->System.out.println(e));
	}
}
