package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapExample
{
    public static void main(String args[])
    {
	Scanner s=new Scanner(System.in);
	LinkedHashMap<String,Integer> map2= new LinkedHashMap<String,Integer>();//creating linked hash map
	System.out.println("Enter no:of input");
	int n=s.nextInt();
	System.out.println("Enter the inputs");
	for(int i=0;i<n;i++)
	{
		String no=s.next();
		int no1=s.nextInt();
		map2.put(no,no1);
	}
	for(Map.Entry m:map2.entrySet())//for printing out put one by one
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
