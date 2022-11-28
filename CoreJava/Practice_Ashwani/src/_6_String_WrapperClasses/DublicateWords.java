package _6_String_WrapperClasses;

public class DublicateWords
{
	public static void main(String[] args) 
	{
		String str="ashwani kumar chaurasiya";
		
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		int arr[]=new int[126]; //because of ASCII value 0~126
		
		for(int i=0; i<str.length(); i++)
		{
			
			arr[i]=str.charAt(i) ;   //storing string into array	
			arr[str.charAt(i)] +=1;
		}
		
		//max occuring character are 
		int max=-1;
		char c=' ';
		
		for(int i=0; i<str.length(); i++)
		{
			
			if(max<arr[str.charAt(i)])
			{
				
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println("The maximum repeated words are : "+c);
		
		
		//minimum occuring character are 
		int min=str.length();
		char c2=' ';
		
		for(int i=0; i<str.length(); i++)
		{
			
			if(min>arr[str.charAt(i)])
			{
				
				min=arr[str.charAt(i)];
				c2=str.charAt(i);
				
			}
		}
		System.out.println("The minimum repeated words are : "+c2);
	}
}
