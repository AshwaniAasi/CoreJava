package _6_String_WrapperClasses;
/*----------------------------------------------------Need more time for understand--------------------------------------------------
 WAP that takes your full name as input and display the abbreviaions of the first and middle names except the 
 last name which is displayed as it is. i.e If your name is Robert Brett Roser, then the output should be R. B. Roser.
 */
public class _6_ConvertNaming 
{
	public static void main(String[] args) 
	{
		String name="Ashwani Kumar Chaurasiya";
		String sr="";
		sr+=name.charAt(0);
		sr+=".";
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)==' ' && name.charAt(i+1) !=' ' && i+1<name.length())
			{
				sr=(sr+name.charAt(i+1)).toUpperCase();
				sr+=". ";
			}
		}
		String lastWord="";
		// to get last word
		for (int i=name.length()-1; i>=0; i--)
		{
			if(name.charAt(i)==' ')
			{
				lastWord = name.substring(i+2);
				break;
			}
		}
		// to remove last "."
		sr=sr.substring(0,sr.length()-2);
		sr=sr+lastWord;
		System.out.println("Hello! , "+sr);
	}
}
