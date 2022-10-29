package _2_controlStatement;

//WAP to display prime number 1 - 100
public class _29_primeNumber 
{
	public static void main(String[] args) 
	{
		int i=0, num=0;
		String primeNumbers=" ";
		for (i=1 ; i<=100; i++)
		{
			int counter=0;
			for (num=i ; num>=1; num--)
			{
				if (i%num==0)
				{
					counter=counter+1;
				}
			}
			if(counter ==2)
			{
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println("Prime number are : "+'\n'+primeNumbers);
	}
}
