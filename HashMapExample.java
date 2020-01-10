package collections;
import java.util.*;
public class HashMapExample 
{
   
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		HashMap<Integer,String> student= new HashMap<Integer,String>();
		System.out.println("Enter the no:of students");
		int n=s.nextInt();
		System.out.println("Enter the details");
		for(int i=0;i<n;i++)
		{
			int roll=s.nextInt();
			String name=s.next();
			student.put(roll,name);
		}
		for(Map.Entry m:student.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
