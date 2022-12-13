package _1_basicAndHistroy;

public class BitwiseOperator1 
{
	public static void main(String[] args) 
	{
		int no1=10; //bit 1010
		int no2=2; //bit 0010
		System.out.println(no1&no2); //1010 & 0010 => 0010 & (bitwise AND)
		System.out.println(no1|no2); //1010 | 0010 => 1010  | (bitwise OR)
		System.out.println(no1^no2); //1010 ^ 0010 => 1000 ^(bitwise exclusive OR)
		
	}
}
