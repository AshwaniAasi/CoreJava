package _8_MultiThreading;
// WAP to set periorities of thread.

public class _4_SetPriorities extends Thread
{
	public void run()
	{
	//	System.out.println("I m inside run method");
		String priName=Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		System.out.println("Priority Name "+priName+" Priority "+priority);
	}
	public static void main(String[] args) 
	{
		_4_SetPriorities t1=new _4_SetPriorities();
		_4_SetPriorities t2=new _4_SetPriorities();
		_4_SetPriorities t3=new _4_SetPriorities();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
