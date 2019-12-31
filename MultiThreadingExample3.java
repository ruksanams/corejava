package exceptionhandling;
public class MultiThreadingExample3 extends Thread
{
   public static void main(String args[])
   {
	   MultiThreadingExample3 t1=new MultiThreadingExample3();//creating thread for the class
	   t1.start();
   }
   public void run()
   {
	   System.out.println("Am in run method by extending thread");
   }
}
