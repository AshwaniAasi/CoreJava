package Data_Structure;

class DifferentWayToPrintArray 
{
	public static void main(String[] args) 
	{
		int []a= {10,30,100,50,90};
		
		System.out.println("way-1(for loop)");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("==================");
		
		System.out.println("way-2(iterate the elements in backword direction)");
		for (int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("==================");
		

		System.out.println("way-3 (while loop)");
		int j=0;
		while(j<a.length)
		{
			System.out.print(a[j]+" ");
			j++;
		}
		System.out.println();
		System.out.println("==================");
		
		System.out.println("way-4 (for-each loop)");
		for (int v:a)
		{
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println("==================");
		
		System.out.println("for String characters");
		String [] str= {"ashwani", "anuradha", "sandhya","nanhi","sonali","puja","suman","divya","anjali"};
		for (String s:str)
		{
			System.out.print(s+" | ");
		}
	}
}
