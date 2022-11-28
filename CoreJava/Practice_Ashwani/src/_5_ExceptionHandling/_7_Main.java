package _5_ExceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class _7_Main extends Exception
{
	_7_Main(String msg)
	{
		super(msg);
	}
	
	public static void main(String[] args) 
	{
		Logic lo=new Logic();
		try
		{
			lo.checkLang("Java");
		} 
		catch (_7_Main e) 
		{
			System.out.println("[ "+e+" ] Exception occured");
		}
	}
}

class Logic
{
	ArrayList<String> bhasa=new ArrayList<String>(Arrays.asList("Java","Python","Ruby","C++"));
	
	void checkLang(String nawabhasa) throws _7_Main
	{
		if(bhasa.contains(nawabhasa))
		{
			throw new _7_Main("in List "+bhasa+" your language "+nawabhasa+" is already exist");
		}
		else
		{
			bhasa.add(nawabhasa);
			System.out.println(nawabhasa+" is added sucessfully...");
			System.out.println(bhasa);
		}
	}
}

