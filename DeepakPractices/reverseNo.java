
class reverseNo 
{
	public static void main(String[] args) 
	{
		int no=5678;
		int temp=no;
		int rem, rev=0;
		
		while (temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("The Number is : "+no+'\n'+"and the Reverse Number is : "+rev);
	}
}
