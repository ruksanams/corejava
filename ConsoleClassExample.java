package consoleclass;
import java.io.Console;
public class ConsoleClassExample
 {
   public static void main(String args[])
   {
	   String str;
	   Console con=System.console();//creating object for console class
	   if(con==null)
	   {
		   System.out.print("No console available");
		   return;
	   }
	   str = con.readLine("Enter your name: ");//reading string
	   System.out.print(str);
	   System.out.println("Enter the password: ");//reading password
	   char[] ch=con.readPassword();
	   String pass=String.copyValueOf(ch);
	   System.out.println("Paassword is: "+pass);
   }
 }
