package exceptionhandling;
class Numbers extends Thread
{
   public void run()
   {
	   for(int i=0;i<10;i++)
	   {
		   System.out.println("Thread1 is running: "+i);
	   }
   }
}
class Number1 extends Thread
{
	public void run()
	{
		for(int i=10;i<20;i++)
			 System.out.println("Thread2 is running: "+i);
	}
}
public class MultiThreading 
{
  public static void main(String args[])
  {
	  Numbers thread1= new Numbers();//creating thread for Numbers class
	  Number1 thread2= new Number1();//creating thread for Number1 class
	  thread1.start();
	  thread2.start();
  }
}
