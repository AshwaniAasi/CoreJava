package _6_String_WrapperClasses;

public class _1_FindLengthOfString 
{
	public static void main(String[] args) 
	{
		String str="Ashwani Kumar Chaurasiya";
		
		System.out.println("The total Length (with Spaces) of String are : "+str.length());
		
		
		//for count all words 
		boolean flag;
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				flag=false;
			}
			else if (flag=true)
			{
				count++;
			}
		}
		System.out.println("The Length of total Words(without Spaces) are : "+count);
		
		
	}
}
