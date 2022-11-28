package _6_String_WrapperClasses;
/*
 WAP to print the duplicate characters from the given String....
 */
class FindDuplicate
{
	static void getDuplicate(String str)
	{
		char string[] =str.toCharArray();
		int count=0;
		for (int i=0; i<string.length; i++)
		{
			count=1;
			for(int j=i+1; j<string.length; j++)
			{
				if(string[i]==string[j] && string[i] != ' ')
				{
					count ++;
					string[j]=0; // for don't repeat char 
				}
			}
			if(count >1 && string[i] !=0)
			{
				System.out.print(string[i]+ " ");
			}
		}
	}
}


public class _9_duplicateCharacter 
{
	public static void main(String[] args) 
	{
		String name="Ashwani Kumar Chaurasiya";
		FindDuplicate.getDuplicate(name);
	}
}
