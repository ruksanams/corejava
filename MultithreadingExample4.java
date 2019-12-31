package exceptionhandling;

public class MultithreadingExample4 extends Thread
{
  
   public void run()
   {
	   try
	   {
		   System.out.println("Music player is running");
		   Thread.sleep(1000);
		   
	   }
	   catch(InterruptedException e)
	   {
		   System.out.println("Received a WhatsApp notification");
	   }
   }
   public static void main(String args[])
   {
	    MultithreadingExample4 t= new  MultithreadingExample4();
	    t.start();
	    t.interrupt();
   }
}
