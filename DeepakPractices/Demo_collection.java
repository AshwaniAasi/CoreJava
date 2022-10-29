
class Demo_collection implements Cloneable
{
		int i;
		String str;
		Demo_collection()	{}
		Demo_collection(int i, String str)
		{
			this.i=i;
			this.str=str;
		}
		public static void main(String[] args) throws CloneNotSupportedException 
		{
			Demo_collection t1=new Demo_collection(10,"deepak");
			Demo_collection t2=(Demo_collection)t1.clone();
			System.out.println(t2.i);
			System.out.println(t2.str);
		}
}
