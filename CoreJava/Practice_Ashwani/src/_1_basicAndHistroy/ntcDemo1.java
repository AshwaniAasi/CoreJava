package _1_basicAndHistroy;

public class ntcDemo1 {
	public static void main(String[] args) {
		int no1=10;
		short no2=50;
	//	byte no2=no1;
	//	byte no2=(byte)no1; //cast operator
		short no3=(short) (no1+no2); //
		short no4=(byte)(short) no1; //multiple cast operator
		
		int a=134;
		byte b=(byte) a;
		
		System.out.println(b); //-122
		
	}

}
