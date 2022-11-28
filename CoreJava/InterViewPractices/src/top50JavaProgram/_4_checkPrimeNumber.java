package top50JavaProgram;
/*
 * we can write a simple program to divide the given number "n" from 2 to n/2 and check the remainder. If the remainder is
 * 0, then it's not a prime number.
 * 
 * But, This is not very memory and time-efficient. For a given number N, If there is a prime number M between 2 to 
 * squareRoot of N that evenly divided it, then N is not a prime number.
 */
public class _4_checkPrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); //false
	}
	public static boolean isPrime(int n)
	{
		if (n==0 || n==1)
		{
			return false;
		}
		if (n==2)
		{
			return true;
		}
		for (int i=2 ; i<=n/2; i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
