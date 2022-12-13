package _6_String_WrapperClasses;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String name="Ashwani kumar";
		int length=name.length();
		String rev="";
		for(int i=length-1; i>=0; i--)
		{
			rev+=name.charAt(i);
		}
		System.out.println(rev);
	}
}
