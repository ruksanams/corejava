package collections;
import java.util.*;
public class IteratorExample 
{
	public static void main(String[] args)
	{
		List<String> words=new LinkedList<String>();//creating list
		words.add("Competition");//adding elements
		words.add("Be positive");
		words.add("Happy Day");
		Iterator itr=words.iterator();//creating object for iterator
		while(itr.hasNext())//checking if next element is present or not
		{
		    System.out.println(itr.next());//printing elements
		}
	}
}
