package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 How many ways to print a stream.
 */
public class WayToPrintStream 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(25);
		al.add(23);
		al.add(24);
		al.add(27);
		al.add(45);
		al.add(15);
		al.add(78);
		al.add(252);
		al.add(245);
		
		/*
		//1st way to get stream
		Stream<Integer>  s1 = al.stream();
	//	System.out.println(s1); 	// java.util.stream.ReferencePipeline$Head@3fee733d
		s1.forEach(e->System.out.println(e));
		*/
		
		/*
		// 2nd way to get Stream
		Stream s2 = Stream.of(al);
		s2.forEach(e->System.out.println(e));
		*/
		
		/*
		 // 3rd way to get Stream
		Stream<Integer> s3 = Stream.of(10, 20, 35, 45 , 4578, 454);
		s3.forEach(e->System.out.println(e));
		 */
		
		/*
		//4th way to get Stream
		int [] arr= {45,75,85,95,105,55,74};
		IntStream s4 = Arrays.stream(arr);
		s4.forEach(e->System.out.println(e));
		*/
		
		/*
		//5th way to get empty Stream 
		Stream<Object> s5 = Stream.empty();
		s5.forEach(e->System.out.println("Empty Stream is : "+e));
		*/
		
		/*
		// 6th way to get empty Stream
		Stream<Object> s6 = Stream.builder().build();
		s6.forEach(e->System.out.println(e));
		*/
		
		//
		
	}
}
