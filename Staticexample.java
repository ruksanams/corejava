package staticexaple;

public class Staticexample 
 {
  static int count=0;
  staticexample()
   {    
	count++;
	System.out.println(count);
   }
public static void main(String args[])
   {
	staticexample a=new staticexample();//creating first object
	staticexample b=new staticexample();//creating second object
	staticexample c=new staticexample();//creating third object
	
  }
 }
