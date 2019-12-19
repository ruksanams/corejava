package stringmethods;
public class EndsWithExample2
{
	public static void main(String args[])
	  {
		  String str="Welcome to FACE.in";
		  System.out.println(str.endsWith("in"));//true because string ends with "in"
		  if(str.endsWith(".com"))//checking the last characters
		   {
			  System.out.println("String ends with.com");
		   }
		  else
			  System.out.println("It does not ends with.com");
	  }
}
