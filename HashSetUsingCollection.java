package collections;
import java.util.*;
public class HashSetUsingCollection
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   ArrayList<Integer> obj= new ArrayList<Integer>();//creating Array list
	   System.out.println("Enter the no:of elements ");
	   int n=s.nextInt();
	   System.out.println("Enter the elements ");
	   for(int i=0;i<n;i++)
	   {
		   int a=s.nextInt();
		   obj.add(a);//adding elements to Array list
	   }
	   Set<Integer> set1= new HashSet<Integer>();//creating Hash set
	   set1.addAll(obj);//adding all elements of Array list into Hash set
	   System.out.println(set1);
   }
}
