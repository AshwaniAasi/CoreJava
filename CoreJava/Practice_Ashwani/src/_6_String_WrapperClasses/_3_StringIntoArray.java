package _6_String_WrapperClasses;
/*-----------------------------------------------------------SomeConfusions----------------------------------------------------------
 WAP  to convert a String sentence into a String array.
 */
public class _3_StringIntoArray
{
	public static void main(String[] args) 
	{
		String a="Hello Welcome to world of 1 java programming Langugage";
		String [] words=a.split("\\s+");	// not able to understand function of this line

		for (int i=0; i<words.length; i++)
		{
			words[i]=words[i].replaceAll("[^\\w]", ""); // not able to understand function of this line
			System.out.println("words : [ "+i+" ] = "+words[i]);
		}
	}
}
