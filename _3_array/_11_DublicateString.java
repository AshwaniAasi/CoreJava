package _3_array;

//WAP to find the duplicate value of an array of String value.
public class _11_DublicateString 
{
	public static void main(String[] args) 
	{
		String [] str= {"ashwani","rahul","rahul","ravi","anuradha"};
		for(int a=0; a<str.length; a++)
		{
			for(int b=a+1; b<str.length; b++)
			{
				if(str[a]==str[b])
				{
					System.out.println(str[a]);
				}
			}
		}
		
	}
}
