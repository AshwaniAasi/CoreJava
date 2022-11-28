package _8_MultiThreading;
/*
  WAP for Producer-Consumer Problem. (The Producer-Consumer problem is the classical concurrency of a
  multi-process synchronization problem. It is also known as the bound-buffer problem.
  The Problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer
  used as a queue. The producer generates a piece of data, puts it into the buffer and starts again.)
 */
//NOT CLEAR-----------------------------------------
class Shop
{
	private int materials;
	private boolean available=false;
	
	public synchronized int get()
	{
		while(available == false)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
		available= false;
		notifyAll();
		return materials;
	}
	
	public synchronized void put(int value)
	{
		while(available==true)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
		materials = value;
		available = true;
		notifyAll();
	}
}
class Consumer extends Thread
{
	private Shop shop;
	private int number;
	
	public Consumer(Shop c, int number)
	{
		shop =c;
		this.number=number;
	}
	
	public void run()
	{
		int value=0;
		for(int i=0; i<10; i++)
		{
			value=shop.get();
			System.out.println("Consumed value "+this.number+" got "+value);
		}
	}
}

class Producer extends Thread
{
	private Shop shop;
	private int number;
	
	public Producer(Shop c, int number)
	{
		shop=c;
		this.number=number;
	}
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			shop.put(i);
			System.out.println("Produced value "+this.number+" put "+i);
			
			try 
			{
				 sleep((int)(Math.random()*100));
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
	}
}

public class _3_ProducerConsumer
{
	public static void main(String[] args) 
	{
		Shop c=new Shop();
		Producer p1=new Producer(c, 1);
		Consumer c1=new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}
