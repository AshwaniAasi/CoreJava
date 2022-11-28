package _6_String_WrapperClasses;

import java.util.Arrays;

/*
 WAP  to check if two given String is the anagram of each other? 
 (An anagram contains are of the same length and contains the same character)
 */
public class _5_Anagram 
{
	public static void main(String[] args) 
	{
		String str1="Race";
		String str2="Care";
		
		str1=str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//checking if length is same
		if(str1.length()==str2.length())
		{
			//convert String to char Array
			char[] charArray1=str1.toCharArray();
			char[] charArray2=str2.toCharArray();
			
			//sort the char Array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			// if sorted char arrays are same, then the String are anagram...
			boolean result=Arrays.equals(charArray1, charArray2);
			if(result)
			{
				System.out.println(str1+" and "+str2+" are anagram");
			}
			else
				System.out.println(str1+" and "+str2+" are not anagram");
			
		}
	}
}
