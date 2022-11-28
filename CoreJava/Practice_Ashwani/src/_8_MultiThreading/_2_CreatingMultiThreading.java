package _8_MultiThreading;
/*
 WAP to creating multiple Threads.
 */
class MultiThread extends Thread
{
	private Thread thread;
	private String threadName;
	
	public MultiThread(String msg) 
	{
		threadName = msg;
		System.out.println("Creating thread : "+threadName);
	}
	public void run()
	{
		System.out.println("Running thread : "+threadName);
		try
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("Thread: "+threadName+", "+i);
				Thread.sleep(50);
			}
		}
		catch (InterruptedException ie)
		{
			System.out.println("Exception in thread : "+threadName);
		}
		System.out.println("Thread "+threadName+" continue...");
	}
	
		public void start()
		{
			System.out.println("Start Method "+threadName);
			
			if(thread==null)
			{
				thread = new Thread(this.threadName);
				thread.start();
			}
		}	
	}	

public class _2_CreatingMultiThreading 
{
	public static void main(String[] args) 
	{
		MultiThread thread1=new MultiThread("First Thread");
		thread1.start();
		MultiThread thread2=new MultiThread("Second Thread");
		thread2.start();
	}
}
