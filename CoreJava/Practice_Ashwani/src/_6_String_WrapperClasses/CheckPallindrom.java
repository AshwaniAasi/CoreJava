package _6_String_WrapperClasses;

public class CheckPallindrom 
{
	public static void main(String[] args) 
	{
		String rev="", str="abcdcba";
		int length=str.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev+=str.charAt(i);
		}
		if (str.equals(rev))
		{
			System.out.println("This is pallindrom number");
		}
		else
			System.out.println("This is not a pallindrom number");
	}
}
