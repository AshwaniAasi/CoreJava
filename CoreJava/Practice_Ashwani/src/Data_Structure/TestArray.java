package Data_Structure;

class TestArray {
	public static void main(String[] args) {
		// int [] a=new int [3]; //creation
		// way 1 to inst value
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;

		// way 2 creation and intilization one line

		int[] a = { 10, 20, 30 };
		System.out.println(a); // [I@2c7b84de
		System.out.println(a.length); // 3
		System.out.println("__________________________________________");
		// for (int i=0; i<a.length; i++) //for loop
		for (int var : a) // for-each loop
		{
			System.out.println(var);
		}
	}
}
