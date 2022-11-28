package _1_basicAndHistroy;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

class HideFile 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("D:\\Practices (Smart Programming)\\File_Hide");
		if (f.mkdir())
		{
			System.out.println("Success to creating new folder");
		}
		else 
		{
			System.out.println("failed to creating new folder");
		}
		
		File f1=new File("D:\\Practices (Smart Programming)\\File_Hide\\abc.txt");
	
		if (	f1.createNewFile())
		{
			System.out.println("Success to creating new file");
		}
		else 
		{
			System.out.println("failed to creating new file");
		}
		
		Path p= Paths.get("D:\\Practices (Smart Programming)\\File_Hide\\abc.txt");
//		Files.setAttribute(p, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
		Files.setAttribute(p, "dos:hidden", false, LinkOption.NOFOLLOW_LINKS);
	}
}
