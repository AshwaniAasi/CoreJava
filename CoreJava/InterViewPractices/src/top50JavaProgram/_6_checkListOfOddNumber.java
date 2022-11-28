package top50JavaProgram;
/*
 * Check if a list of integers contains only odd numbers?
 * We can use for loop and check each elements one by one if they are odd or not.
 public static boolean onlyOddNumber(List<Integer> list)
	 {
		 for(int i:list)
		 {
			 if (i%2==0)
			 {
				 return false;
			 }
		 }
		 return true;
	 }
	 If the list is huge, we can use parallel stream for faster processing.
 */

import java.awt.List;

//public class _5_checkListOfOddNumber 
//{
//	 public static boolean onlyoddNumbers(List list)
//	 {
//		 return list
//				 .parallelStream() // parallel stream for faster processing
//				 .anyMatch(x->x%2!=0); // return as soon as any elements match the condition
//	 }
//}
