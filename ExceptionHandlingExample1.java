package exceptionhandling;
public class ExceptionHandlingExample1
{
   static void check()throws ArithmeticException
   {
	   System.out.println("Inside check function");
	   throw new ArithmeticException("FACE kollam");//exception throw to catch block
   }
   public static void main(String args[])
   {
	   try
	   {
		   check();
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("caught "+e);//catch block handles exception
	   }
   }
}
