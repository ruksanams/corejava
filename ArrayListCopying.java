package collections;
import java.util.*;
public class ArrayListCopying
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   List<String> words=new LinkedList<String>();//creating object for linked list
	   for(int i=0;i<n;i++)
	   {
		   String a=s.next();
		   words.add(a);//adding elements to the array list
	   }
	   
	   ArrayList<String> words1=new ArrayList<String>();//creating object for array list
	   int n1=s.nextInt();
	   for(int j=0;j<n1;j++)
	   {
		   String b=s.next();
		   words1.add(b);//adding elements to the array list
	   }
	   System.out.println("Actual linkedList:"+words);//printing linked list
	   words.addAll(words1);//copying array list elements into linked list
	   System.out.println("After Copy:"+words);
   }
}
