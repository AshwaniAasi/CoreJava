package top50JavaProgram;
/*
 * We can use regular expression to check if the String contains vowels or not.
 */
public class _3_VowelPresentInString 
{
	public static void main(String[] args) 
	{
		System.out.println(stringContainsVowels("HELLO")); //true
		System.out.println(stringContainsVowels("TV")); //false
		
	}
	public static boolean stringContainsVowels(String input)
	{
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
