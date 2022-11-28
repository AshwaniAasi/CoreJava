package StreamAPI;

import java.util.ArrayList;

public class MakeSquare {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(2);
		al.add(4);
		al.add(9);
		al.add(6);
		al.add(23);
		al.add(5);
		
		al.stream().map(e->(e*e)).forEach(e->System.out.println(e));
		
		
		
		
	}

}
