package StreamAPI;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//WAP to add all the even numbers
public class sumOfEvenNumber {
	public static void main(String[] args) {
		
		Stream<Integer> list = Stream.of(2, 5, 4, 8, 4,3, 1);
	
		/*
		 
		// old approach
		int sum=0; 
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			sum +=itr.next();
		}
		System.out.println(sum);
		
		 */
		
		Stream<Integer> filter = list.filter(e->e%2==0);  //get all the even numbers
		IntStream is=filter.mapToInt(Integer :: intValue);	//convet the Stream into IntStream (method reference)
		System.out.println(is.sum()); 							// Sum all the number present in the Stream
		
		
		//18 sum of even number
		
		
		
		
		
		
		
	}
}
