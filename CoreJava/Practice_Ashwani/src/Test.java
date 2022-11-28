
interface FuncInterface
{
	void abstractFun(int x); //abstract method
	
	default void normalFun() //default method
    {
       System.out.println("Hello");
    }
}
  
class Test
{
    public static void main(String args[])
    {
        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abstractFun(5);
    }
}
