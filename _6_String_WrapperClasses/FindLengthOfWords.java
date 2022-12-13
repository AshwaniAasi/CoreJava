package _6_String_WrapperClasses;

public class FindLengthOfWords 
{
	public static void main(String[] args) 
	{
		String str="Ashwani Kumar Chaurasiya";
		int count=0;
		boolean flag=true;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				flag=true;
			}
			else if(flag==true)
			{
				flag=false; //this will count only word if you want to count all alphabets then comment this line.
				count++;
			}
		}
		System.out.println(count);
		
	}
}
