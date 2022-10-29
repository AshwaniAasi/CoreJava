import java.io.File;
import java.io.FilenameFilter;

public class Searchfile3
{
	public static void main(String[] args) 
	{
		File f=new File("D:\\Practices (Smart Programming)");
		String [] str=f.list(new FilenameFilter() 
		{			
			@Override
			public boolean accept(File dir, String name) 
			{
		//		return name.startsWith("F");
				return name.endsWith(".java");
			}
		});
		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
}

