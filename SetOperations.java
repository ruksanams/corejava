package collections;
import java.util.*;
public class SetOperations 
{
   public static void main(String args[])
   {   
	   Scanner s=new Scanner(System.in);
	   Set<Integer> set1=new HashSet<Integer>();//creating HashSet for set1
	   System.out.println("Enter the no:of elements ");
	   int n=s.nextInt();
	   System.out.println("Enter the no:of elements in set1 ");
	   for(int i=0;i<n;i++)
	   {
		int a=s.nextInt();
		set1.add(a);//adding elements to set1 
	   }
	   Set<Integer> set2=new HashSet<Integer>();//creating HashSet for set2
	   System.out.println("Enter the no:of elements");
	   int n1=s.nextInt();
	   System.out.println("Enter the no:of elements in set2");
	   for(int i=0;i<n1;i++)
	   {
		int b=s.nextInt();
		set2.add(b);//adding elements to set2
	   }
	   
	   //union operation
	   Set<Integer> union=new HashSet<Integer>(set1);
	   union.addAll(set2);
	   System.out.println("After union operation:");
	   System.out.println(union);
	   
	   //Intersection operation
	   Set<Integer> intersection=new HashSet<Integer>(set1);
	   intersection.retainAll(set2);
	   System.out.println("After intersection operation:");
	   System.out.println(intersection);
	   
	   //Symmetric difference operation
	   Set<Integer> symmetric_diff=new HashSet<Integer>(set1);
	   symmetric_diff.removeAll(set2);
	   System.out.println("After Symmetric difference operation:");
	   System.out.println(symmetric_diff);
   }
}
