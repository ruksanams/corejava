package collections;
import java.util.*;
import java.lang.Math;
public class HashSetExample1 
{
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  Set<Integer> set1=new HashSet<Integer>();//creating Hash set
	  ArrayList<Integer> set2=new ArrayList<Integer>();//creating Array list
	  System.out.println("Enter the no:of elements ");
	  int n=s.nextInt();
	  System.out.println("Enter the elements ");
	  for(int i=0;i<n;i++)
	  {
		  int n1=s.nextInt();
		  set2.add(n1);//adding elements to the Array list
	  }
	  set1.addAll(set2);//copying Array list elements to Hash set
	  System.out.println("numbers: "+set1);//printing the Hash set elements
	  System.out.println("Enter the element removed ");
	  int n3=s.nextInt();
	  set1.remove(n3);//remove element from Hash set
	  System.out.println("After remove ("+n3+"):"+set1);
	  
	  //removing perfect squares from the Hash set
	  for(int i=0;i<set2.size();i++)
	  {
		  int n4=set2.get(i);
		  int sq=(int)Math.sqrt(n4);
		  if((sq*sq)==n4)
		  {
			  set1.remove(n4);
		  }
		 
	  }
	  
	  System.out.println("After removeAll(perfectSquares): "+set1);
	  //clearing the Hash set elements
	  set1.clear();
	  System.out.println("After clear(): "+set1);
  }
}
