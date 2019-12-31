package exceptionhandling;
class MusicPlayer extends Thread
{
	public void run()
	{
		System.out.println("Music is Playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing Ms Word document");
	}
}
public class MultiThreadingExample1 
{
   public static void main(String args[])
   {
	   MusicPlayer thread1=new MusicPlayer();//creating thread for MusicPlayer class
	   Runnable obj1=new MsWord();//can be reference of Runnable interface
	   Thread thread2=new Thread(obj1);//invokes thread class constructor
	   thread1.start();
	   thread2.start();
	   
   }
}
