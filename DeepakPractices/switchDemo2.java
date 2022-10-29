
public class switchDemo2 
{
	public static void main(String[] args) 
	{
		String name="102";
		final String name1="101";
		final String name2="102";
		final String name3="103";
		final String name4="104";
		switch (name)
		{
		case name1 : System.out.println("amit");
		break;
		case name2 : System.out.println("anuradha");
		break;
		case name3 : System.out.println("ashwani");
		break;
		case name4 : System.out.println("ankit");
		break;
		default : System.out.println("invalid");
		
		}
	}
}
