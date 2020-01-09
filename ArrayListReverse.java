package collections;
import java.util.*;
public class ArrayListReverse 
{
   public static void main(String args[])
   {   
	   Scanner s=new Scanner(System.in);
	   ArrayList<String> stationary = new ArrayList<String>();//creating Array list
	   System.out.println("Enter the no:of items");
	   int n=s.nextInt();
	   System.out.println("Enter the items");
	   for(int i=0;i<n;i++)
	   {
		   String item=s.next();
		   stationary.add(i,item);//adding items to the list
	   }
	   System.out.println(stationary);//printing the actual list
	  //reversing the list 
	   for(int i=n-1;i>=0;i--)
	   {
		   System.out.println(stationary.get(i));
	   }
   }
}
