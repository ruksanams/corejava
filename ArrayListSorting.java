package collections;
import java.util.*;
public class ArrayListSorting 
{
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the no:of subjects");
	  int n=s.nextInt();
	  ArrayList<Integer> marks=new ArrayList<Integer>();//creating Array list
	  System.out.println("Enter the marks");
	  for(int i=1;i<=n;i++)
	  {
		  int submark=s.nextInt();
		  marks.add(submark);
	  }
	  System.out.println(marks);
	  Collections.sort(marks);//sorting array list
	  System.out.println("Sorted list is :");
	  System.out.println(marks);
  }
}
