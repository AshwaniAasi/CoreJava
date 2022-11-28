package _9_Collection;

import java.util.Collections;
import java.util.PriorityQueue;

// WAP to change priorityQueue to maximum priority Queue.
public class _13_ChangePriorityQtoMaxPriQ 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(10, Collections.reverseOrder());
		pq1.add(12);
		pq1.add(10);
		pq1.add(20);
		pq1.add(54);
		pq1.add(62);
		pq1.add(82);
		pq1.add(72);
		pq1.add(16);
		
		System.out.println("Original PriorityQueue : \n"+pq1);
		
		System.out.println("\nMaximum Priority Queue : ");
		
		Integer val=null;
		
		while((val=pq1.poll()) != null)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		
	}
}
